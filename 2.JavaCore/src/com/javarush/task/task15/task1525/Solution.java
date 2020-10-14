package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            FileInputStream fstream = new FileInputStream(Statics.FILE_NAME);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strline;
            while ((strline = br.readLine()) != null) {
                lines.add(strline);
            }

        }

        catch (IOException e) {
            System.out.println("ошибка" + e);
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
