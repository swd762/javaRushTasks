package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<Integer> arrayMain = new ArrayList<>();
       for (int i = 0; i <20 ; i++) {
        arrayMain.add(Integer.parseInt(reader.readLine()));
        }
       ArrayList<Integer> arrayList3 = new ArrayList<>();
       ArrayList<Integer> arrayList2 = new ArrayList<>();
       ArrayList<Integer> arrayListOther = new ArrayList<>();
        for (int i = 0; i <arrayMain.size() ; i++) {
            if ((arrayMain.get(i)%2==0) && (arrayMain.get(i)%3==0)) {
                arrayList3.add(arrayMain.get(i));
                arrayList2.add(arrayMain.get(i));
            } else if (arrayMain.get(i)%2==0) arrayList2.add(arrayMain.get(i));
            else if (arrayMain.get(i)%3==0) arrayList3.add(arrayMain.get(i));
            else arrayListOther.add(arrayMain.get(i));

        }

        printList(arrayList2);
        printList(arrayList3);
        printList(arrayListOther);

    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
