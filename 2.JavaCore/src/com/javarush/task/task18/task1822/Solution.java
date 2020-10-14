package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader readkey = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(readkey.readLine());
        readkey.close();
        BufferedReader input = new BufferedReader(fr);
        String line;
        while((line = input.readLine())!= null) {
          if (Integer.parseInt(line.split(" ")[0]) == Integer.parseInt(args[0]))
            System.out.println(line);
        }
        input.close();
        fr.close();
    }
}
