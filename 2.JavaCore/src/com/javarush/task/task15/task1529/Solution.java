package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
        try {
            reset();
        }
        catch (Exception e) {
            System.out.println("sorry, no string to be input");
        }
    }

    public static CanFly result;

    public static void reset() throws Exception {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        if (str.equals("helicopter")) {
            result = new Helicopter();
            reader.close();
        } else if (str.equals("plane")) {
            result = new Plane(4);
            reader.close();
        }

    }
}
