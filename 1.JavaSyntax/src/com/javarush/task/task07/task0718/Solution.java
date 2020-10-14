package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arrayList = new ArrayList<>();



        for (int i = 0; i <10 ; i++) {
            arrayList.add(reader.readLine());


        }

        String test = arrayList.get(0);

        for (int i = 0; i <arrayList.size()-1 ; i++) {
            if (arrayList.get(i+1).length()>=test.length()) test=arrayList.get(i+1);
            else {
                System.out.println(i+1);
                break;
            }
        }

    }
}

