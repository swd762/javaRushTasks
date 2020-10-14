package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Integer[] array = {1, 2, 1, 2, 1, 2, 1, 2, 1, 2};
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i <10 ; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));

        }
        int count = 1;
        int result = 0;

        for (int i = 0; i <arrayList.size()-1 ; i++) {
            if (arrayList.get(i+1).equals(arrayList.get(i)) && i<8 ) count++;
            else {
                if (result < count && i==8) result=count++;
                if (result < count) result=count;

                    count = 1;

                }


            }


        System.out.println(result);

    }
}