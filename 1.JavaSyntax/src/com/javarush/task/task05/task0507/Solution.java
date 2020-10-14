package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double summ = 0;
        double count = 0;
        while(true) {
            double a = Double.parseDouble(reader.readLine());
            if(a==-1) break;
            summ+=a;
            count++;

        }

        System.out.println(summ/count);

    }
}

