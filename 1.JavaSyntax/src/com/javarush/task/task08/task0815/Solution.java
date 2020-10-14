package com.javarush.task.task08.task0815;

import java.util.*;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        String[] arrayName = {"Илья", "Тоня", "Алексей", "лья", "Александр", "Иль", "Тоя", "Аексей", "Иья", "Алсандр" };
        String[] arraySurname = {"Казалин", "Алехина", "Казаин", "Волков", "Але", "Казн", "Алена", "Казан", "Вков", "Ахин"};
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i <arrayName.length ; i++) {
            map.put(arrayName[i], arraySurname[i]);
        }



        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        int cnt = 0;

        while (it.hasNext()) {

            Map.Entry<String, String> me = it.next();

            if (me.getValue() == name) {
                cnt++;
            }

        }

        return cnt;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        int cnt = 0;

        while (it.hasNext()) {

            Map.Entry<String, String> me = it.next();

            if (me.getKey() == lastName) {
                cnt++;
            }

        }

        return cnt;
    }

    public static void main(String[] args) {

    }
}
