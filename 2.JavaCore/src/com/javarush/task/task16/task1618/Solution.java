package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread thread1 = new TestThread();

        thread1.start();
        thread1.interrupt();



    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
        public void run() {}
    }
}