package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List of addresses
        HashMap<String,String> cityMap = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();


            cityMap.put(city, family);
        }
        //System.out.println(cityMap);
        // Read the house number
      String question = reader.readLine();
        System.out.println(cityMap.get(question));

        //if (0 <= houseNumber && houseNumber < addresses.size()) {
       //     String familyName = addresses.get(houseNumber);
       //     System.out.println(familyName);
       // }
    }
}
