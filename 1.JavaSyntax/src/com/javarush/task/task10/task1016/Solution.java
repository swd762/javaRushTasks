package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
         for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
         }







        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        //напишите тут ваш код
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        for (int i = 0; i <list.size() ; i++) {
            Integer freq = result.get(list.get(i));
            result.put(list.get(i), freq == null?1:freq+1);

        }




        return result;
    }

}

