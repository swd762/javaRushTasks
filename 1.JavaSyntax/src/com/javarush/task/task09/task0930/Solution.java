package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);


        for (String x : array) {
            System.out.println(x);

        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        for (int i = 0; i < array.length; i++) {
            if (!isNumber(array[i])) {
                for (int j = 0; j < array.length; j++) {
                    if (!isNumber(array[j])) {
                        if (isGreaterThan(array[j], array[i])) {
                            String tmp = array[i];
                            array[i] = array[j];
                            array[j] = tmp;
                        }
                    }
                }
            } else {
                int a = Integer.parseInt(array[i]);

                for (int j = 0; j < array.length; j++) {
                    if (isNumber(array[j])) {
                        int b = Integer.parseInt(array[j]);
                        if (a > b) {
                            String tmp = array[i];
                            array[i] = array[j];
                            array[j] = tmp;
                        }
                    }
                }
            }
        }

    }

    public static void sortString (ArrayList<String> list) {
        boolean sorted = false;
        String tmp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i <list.size()-1 ; i++) {
                if(isGreaterThan(list.get(i), list.get(i+1))) {
                    tmp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, tmp);
                    sorted = false;
                }

            }
        }
    }

    public static void sortNum (ArrayList<String> list) {
        boolean sorted = false;
        String tmp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i <list.size()-1 ; i++) {
                if (Integer.parseInt(list.get(i))<Integer.parseInt(list.get(i+1))) {
                    tmp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, tmp);
                    sorted = false;
                }

            }
        }
    }



    public static void swap(ArrayList a, ArrayList b) {

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
