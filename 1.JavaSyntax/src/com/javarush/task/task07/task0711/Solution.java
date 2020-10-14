package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arraylist = new ArrayList<>();
        String s = "";
        for (int i = 0; i <5 ; i++) {
            arraylist.add(reader.readLine());
        }

        for (int i = 0; i <13 ; i++) {
            s = arraylist.get(4);
            arraylist.remove(4);
            arraylist.add(0,s);
        }


        for (int i = 0; i <5 ; i++) {
            System.out.println(arraylist.get(i));
        }
    }
}
