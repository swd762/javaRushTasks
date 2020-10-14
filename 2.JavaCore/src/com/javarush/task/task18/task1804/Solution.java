package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        reader.close();

        ArrayList<Integer> bytes = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        try (FileInputStream input = new FileInputStream(fileName)) {
            while (input.available() > 0) {
                int read = input.read();
                bytes.add(read);
                map.put(read, 0);
            }
        }
        catch (Exception e) {

        }



        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            int count = 1;
            for (int i = 1; i < bytes.size(); i++) {
                if (pair.getKey() == bytes.get(i)) {
                    map.put(pair.getKey(), ++count);
                }
            }
        }
        int min = Collections.min(map.values());
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() == min) {
                System.out.print(pair.getKey() + " ");
            }
        }


    }
}
