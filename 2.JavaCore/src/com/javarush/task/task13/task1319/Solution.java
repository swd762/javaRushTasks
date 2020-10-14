package com.javarush.task.task13.task1319;

import java.io.*;
import java.sql.SQLOutput;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new FileWriter(reader.readLine()));
        String line = "";
        while (!line.equals("exit")) {
            line = reader.readLine();
            out.write(line+"\n");
        }
        reader.close();
        out.close();

    }
}
