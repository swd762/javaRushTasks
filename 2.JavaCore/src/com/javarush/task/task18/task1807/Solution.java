package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = "";
        byte symbol = 0;
        int count = 0;
        try {
            filename = reader.readLine();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        reader.close();

        FileInputStream input = new FileInputStream (filename);

        while (input.available()>0) {
            if (input.read() == 44) count++;
        }
        input.close();
        System.out.println(count);
    }
}
