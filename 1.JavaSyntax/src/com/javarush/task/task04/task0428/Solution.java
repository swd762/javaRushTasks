package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[3];
        int b = 0;

        for (int i = 0; i <a.length ; i++) {
          a[i]=Integer.parseInt(reader.readLine());
          if (a[i]>0) b+=1;
        }

        System.out.println(b);

    }
}
