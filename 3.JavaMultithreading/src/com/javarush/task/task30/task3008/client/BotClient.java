package com.javarush.task.task30.task3008.client;

import java.util.Random;

public class BotClient extends Client {

    public static void main(String[] args) {
        Client botClient = new BotClient();
        botClient.run();
    }

    @Override
    protected String getUserName() {
        Random random = new Random();
        return "date_bot_" + (int) (Math.random() * 100);
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    public class BotSocketThread extends SocketThread {

    }

}
