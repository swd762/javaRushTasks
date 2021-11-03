package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static com.javarush.task.task30.task3008.ConsoleHelper.readInt;
import static com.javarush.task.task30.task3008.ConsoleHelper.writeMessage;

public class Server {

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        writeMessage("Enter Server port:");
        int port = readInt();
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            writeMessage("Server started.");
            while (true) {
                Socket socket = serverSocket.accept();
                new Handler(socket).start();
            }
        } catch (IOException e) {
            writeMessage("Error with starting or working with server.");
        }


    }

    public static void sendBroadcastMessage(Message message) {
        for (Connection connection : connectionMap.values()) {
            try {
                connection.send(message);
            } catch (IOException e) {
                writeMessage("We couldn't sent message to " + connection.getRemoteSocketAddress());
            }
        }
    }

    private static class Handler extends Thread {

        Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message message = connection.receive();
                if (message.getType() != MessageType.USER_NAME) {
                    writeMessage("Message received from " + socket.getRemoteSocketAddress() + ". Message type is " +
                            "invalid");
                    continue;
                }
                String userName = message.getData();
                if (userName.isEmpty()) {
                    writeMessage("Trying to connect with empty name from " + socket.getRemoteSocketAddress());
                    continue;
                }

                if (connectionMap.containsKey(userName)) {
                    writeMessage("Trying to connect with existing name from " + socket.getRemoteSocketAddress());
                    continue;
                }
                connectionMap.put(userName, connection);
                connection.send(new Message(MessageType.NAME_ACCEPTED));
                return userName;
            }
        }

        private void notifyUsers(Connection connection, String userName) throws IOException {
            for (String name : connectionMap.keySet()) {
                if (name.equals(userName)) {
                    continue;
                }
                connection.send(new Message(MessageType.USER_ADDED, name));
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message.getType() == MessageType.TEXT) {
                    String data = message.getData();
                    sendBroadcastMessage(new Message(MessageType.TEXT, userName + ": " + data));
                } else {
                    writeMessage("Message received from " + socket.getRemoteSocketAddress() + ". Message type is not " +
                            "equals to protocol");
                }
            }
        }

        @Override
        public void run() {
            writeMessage("Connection established with: " + socket.getRemoteSocketAddress());
            String userName = null;
            try (Connection connection = new Connection(socket)) {
                userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                notifyUsers(connection, userName);
                serverMainLoop(connection, userName);

            } catch (IOException | ClassNotFoundException e) {
                writeMessage("Exchange data error with: " + socket.getRemoteSocketAddress());
            }
            if (userName != null) {
                connectionMap.remove(userName);
                sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
            }

        }

    }

}
