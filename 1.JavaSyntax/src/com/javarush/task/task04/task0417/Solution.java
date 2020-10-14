package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int flag = 0;

        if (a==b && b==c && a==c && flag==0) {
            System.out.println(a + " " + b + " " + c);
            flag = 1;
        }
        if (a==b && flag==0) {
            System.out.println(a + " " + b);
            flag = 1;
        }
        if (b==c && flag==0){
            System.out.println(b + " " + c);
            flag = 1;
        }
        if (a==c && flag==0) {
            System.out.println(a + " " + c);
            flag = 1;
        }

    }
}