package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i <10 ; i++) {
           arrayList.add(reader.readLine());
        }

        int lng_cnt = 0;
        int shrt_cnt = 0;
        String lng = "";
        String shrt = "";
// поиск длинной
        for (int i = 0; i <arrayList.size() ; i++) {
            if (arrayList.get(i).length() > lng.length()) {
                lng = arrayList.get(i);
                lng_cnt = i;
            }
        }
        shrt = arrayList.get(0);
        for (int i = 0; i <arrayList.size() ; i++) {
            if (arrayList.get(i).length() < shrt.length()) {
                shrt = arrayList.get(i);
                shrt_cnt = i;
            }
        }

        if (lng_cnt < shrt_cnt) System.out.println(lng);
        else System.out.println(shrt);



    }
}
