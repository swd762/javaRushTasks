package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();
        int min = 2147483647;
        int data;
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            while (fileInputStream.available()>0) {
                data = fileInputStream.read();
                if (min>data) min = data;
            }
            fileInputStream.close();
            System.out.println(min);
        }
        catch (Exception e) {
            System.out.println("file no found");
        }

    }
}
