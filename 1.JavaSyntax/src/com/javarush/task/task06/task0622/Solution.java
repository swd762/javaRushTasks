package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        int temp = 0;
        for (int i = 0; i <array.length ; i++) {
            array[i] = Integer.parseInt(reader.readLine());

        }

        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if(array[j]<array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }

    }
}
