package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
        String result = "";
        public void run() {
        String s1="";
        String s2="";
        String s3="";
        try {

                s1 = reader.readLine();
                s2 = reader.readLine();
                s3 = reader.readLine();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        result = s1 + " " + s2 + " " + s3;
        }

        public void printResult() {
            System.out.println(result);
        }
    }
}
