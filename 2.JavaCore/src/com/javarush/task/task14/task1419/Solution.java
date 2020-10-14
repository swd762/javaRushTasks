package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

        try {
            int[] mass = new int[3];
            System.out.println(mass[3]);
        }
        catch (Exception e) {
            exceptions.add(e);
        }

        exceptions.add(new java.lang.NullPointerException());
        exceptions.add(new java.lang.IndexOutOfBoundsException());
        exceptions.add(new java.lang.NumberFormatException());
        exceptions.add(new java.io.FileNotFoundException());

        exceptions.add(new java.lang.StringIndexOutOfBoundsException());
        exceptions.add(new java.lang.NegativeArraySizeException());
        exceptions.add(new java.lang.IllegalArgumentException());
        exceptions.add(new java.lang.ClassCastException());

    }
}
