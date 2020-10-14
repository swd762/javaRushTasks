package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[3];
        for (int i = 0; i <num.length ; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }
        if (num[1]==num[2] && num[0]!=num[1]) System.out.println("1");
        if (num[0]==num[1] && num[1]!=num[2]) System.out.println("3");
        if (num[0]==num[2] && num[0]!=num[1]) System.out.println("2");
    }
}
