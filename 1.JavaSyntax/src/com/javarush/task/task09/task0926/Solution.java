package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        int[] arrays = {5, 2, 4, 7, 0};
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i <arrays.length ; i++) {
            int[] massive = new int[arrays[i]];
            for (int j = 0; j <arrays[i] ; j++) {
                massive[j] = 0;
            }
            list.add(massive);

        }
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
