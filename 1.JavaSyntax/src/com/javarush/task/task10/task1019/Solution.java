package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));




        HashMap<String, Integer> hashMap = new HashMap<>();
        while (true) {
            try {
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                hashMap.put(name, id);
            }
            catch (NumberFormatException a) {
                break;
            }
        }
        for (HashMap.Entry<String, Integer> pair : hashMap.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(value + " " + key);
        }

    }
}
