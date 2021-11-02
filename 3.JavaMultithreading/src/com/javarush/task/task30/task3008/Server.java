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

        @Override
        public void run() {

        }

    }

}
