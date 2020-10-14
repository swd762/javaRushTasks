package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int n;

        while(true){
            n = Integer.parseInt(reader.readLine());
            if (n>0) break;
            System.out.println("Ошибка, введите число больше нуля");
        }
        for (int i = 1; i <= n ; i++) {
            int b = Integer.parseInt(reader.readLine());
            if (maximum<b) maximum=b;


        }



        System.out.println(maximum);
    }
}
