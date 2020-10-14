package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[3];
        int pos = 0;
        int neg = 0;

        for (int i = 0; i <num.length ; i++) {
            num[i] = Integer.parseInt(reader.readLine());
            if (num[i]>0) pos+=1;
            if (num[i]<0) neg+=1;
        }
        System.out.println("количество отрицательных чисел: "  + neg);
        System.out.println("количество положительных чисел: "  + pos);
    }
}
