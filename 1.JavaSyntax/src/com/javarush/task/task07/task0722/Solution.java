package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        //напишите тут ваш код

        ArrayList<String> arrayList = new ArrayList<>();
        while (true) {
            s = reader.readLine();
            if (s.equals("end")) break;
            else arrayList.add(s);
        }

        for (String x:arrayList
             ) {
            System.out.println(x);
        }

    }
}