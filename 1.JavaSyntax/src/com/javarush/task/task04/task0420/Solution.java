package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] intArray = new int[3];
        for (int i = 0; i <intArray.length ; i++) {
            intArray[i] = Integer.parseInt(reader.readLine());
        }




        for (int j = 0; j < intArray.length-1; j++)
        {
            for (int k = j + 1; k < intArray.length; k++)
            {
                if (intArray[j] < intArray[k])
                {
                    int temp = intArray[k];
                    intArray[k] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        for (int i = 0; i <intArray.length ; i++) {
            System.out.println(intArray[i]);
        }

    }
}
