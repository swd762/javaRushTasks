package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxString = 0;
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            strings.add(reader.readLine());
        }
        maxString = strings.get(1).length();

        for (String x:strings
        ) {
            if (x.length() < maxString) {
                maxString = x.length();


            }
        }
        for (int i = 0; i <5 ; i++) {
            if (strings.get(i).length() == maxString) {
                System.out.println(strings.get(i));
            }
        }
    }
    }

