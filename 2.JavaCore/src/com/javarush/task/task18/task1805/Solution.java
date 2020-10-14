package com.javarush.task.task18.task1805;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();
        TreeSet<Integer> list = new TreeSet<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            while(fileInputStream.available()>0) {
                list.add(fileInputStream.read());
            }
            fileInputStream.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

        for (Integer num: list
             ) {
            System.out.print(num + " ");
        }

    }
}
