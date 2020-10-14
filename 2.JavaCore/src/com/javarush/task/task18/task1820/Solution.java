package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import static java.lang.Math.round;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя первого файла:");
        String filename1 = reader.readLine();
        System.out.println("Введите имя второго файла:");
        String filename2 = reader.readLine();
        reader.close();
        FileInputStream input = new FileInputStream(filename1);
        FileOutputStream output = new FileOutputStream(filename2);
        byte[] bytes = new byte[input.available()];
        input.read(bytes);
        String s = new String(bytes, StandardCharsets.UTF_8);
        String[] strings = s.split(" ");
        String result = "";
        for (String ssss: strings
             ) {
            int i = round(Float.parseFloat(ssss));
            result = result + " " + i;
        }
        result = result.trim();
        output.write(result.getBytes());
        input.close();
        output.close();
    }
}
