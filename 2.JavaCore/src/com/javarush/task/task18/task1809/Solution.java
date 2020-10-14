package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = "";
        String filename2 = "";
//        String filename1 = "d://1.txt";
//        String filename2 = "d://2.txt";
        try {
            System.out.println("Input source file name");
            filename1 = name.readLine();
            System.out.println("Input destination file name");
            filename2 = name.readLine();
        }
        catch (Exception e) {
            System.out.println("Invalid file name");
        }
        name.close();
        FileInputStream source = new FileInputStream(filename1);
        FileOutputStream destination = new FileOutputStream(filename2);
        byte[] buffer = new byte[source.available()];
        source.read(buffer);
        source.close();
        for (int i = buffer.length-1; i >= 0 ; i--) {
            destination.write(buffer[i]);
        }
        destination.close();



    }
}
