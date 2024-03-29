package com.javarush.task.task27.task2709;

import java.util.concurrent.atomic.AtomicInteger;

public class ProducerTask implements Runnable {

    static AtomicInteger i = new AtomicInteger(0);
    protected volatile boolean stopped;
    private TransferObject transferObject;

    public ProducerTask(TransferObject transferObject) {
        this.transferObject = transferObject;
        new Thread(this, "ProducerTask").start();
    }

    public void run() {
        while (!stopped) {
            transferObject.put(i.incrementAndGet());
        }
    }

    public void stop() {
        stopped = true;
    }

}
