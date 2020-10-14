package com.javarush.task.task07.task0716;

import java.util.ArrayList;
import java.util.Iterator;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).contains("р") && !list.get(i).contains("л")) {
                list.remove(i);
                i--;
            }
            else if (list.get(i).contains("л") && !list.get(i).contains("р")) {
                list.add(i+1,list.get(i));
                i++;
            }
         }


        return list;
    }
}