package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        HashMap<String, Integer> cal = new HashMap<>();
        cal.put("January", 1);
        cal.put("February", 2);
        cal.put("March", 3);
        cal.put("April", 4);
        cal.put("May", 5);
        cal.put("June", 6);
        cal.put("July", 7);
        cal.put("August", 8);
        cal.put("September", 9);
        cal.put("October", 10);
        cal.put("November", 11);
        cal.put("December", 12);

        System.out.println(month + " is the " + cal.get(month) + " month");

    }
}
