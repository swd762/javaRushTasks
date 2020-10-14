package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();
        int max = 0;
        int data = 0;
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            while (fileInputStream.available()>0) {
                data = fileInputStream.read();
                if (data>max) max = data;
            }
            System.out.println(max);
            fileInputStream.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }




    }
}
