package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        String[] surname = {"Казалин", "Алехина", "Галкина", "Плюшкина", "Маркина", "Аминул", "Жолобова", "Волкова", "Лютиков", "Лобанов"};
        Integer[] salary = {500, 500, 200, 100, 600, 250, 220, 300, 380, 400};
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i <surname.length ; i++) {
            map.put(surname[i],salary[i]);
        }

        return map;
    }


    public static void removeItemFromMap(HashMap<String, Integer> map) {

        for (Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();it.hasNext();)
        {
                Map.Entry<String, Integer> mappy = it.next();
                if (mappy.getValue()<500) {
                    it.remove();
                }



        }


    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}