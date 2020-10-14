package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s = reader.readLine();
            if (s.equals("exit")) break;

            try {
                int i = Integer.parseInt(s);
                if (i<=0 || i>=128) print(i);
                if (i>0 && i<128) print((short)i);
            } catch (NumberFormatException ex1) {

                try {

                        double i = Double.parseDouble(s);
                        print(i);



                }

                catch (NumberFormatException ex2) {
                    print(s);
                }


            }


        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
