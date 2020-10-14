package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> test = new ArrayList<>();
        test.add("сосачка");
        test.add("леденец");
        test.add("хуишко");
        test.add("драчушка");
        test.add("залупка");

        System.out.println(test.size());

        for (String s:test
             ) {
            System.out.println(s);
        }
    }
}
