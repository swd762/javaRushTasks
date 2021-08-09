package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {

    private Thread target;
    private State state;

    public LoggingStateThread(Thread target) {
        this.target = target;
        this.state = target.getState();
    }

    @Override
    public void run() {
        System.out.println(state);
        while(state!= State.TERMINATED){
            if(state != target.getState()){
                System.out.println(target.getState());
                state = target.getState();
            }
        }
    }

}
