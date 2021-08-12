package com.javarush.task.task25.task2512;

/*
Живем своим умом
*/

import java.util.ArrayList;
import java.util.List;

public class Solution implements Thread.UncaughtExceptionHandler {

    public static void main(String[] args) {
        try {
            throw new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI")));
        } catch (Exception e) {
            Solution solution = new Solution();
            solution.uncaughtException(Thread.currentThread(), e);
        }
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
      t.interrupt();
        List<String> res = new ArrayList<>();
        while (e != null) {
            res.add(0,e.toString());
            e = e.getCause();
        }
        for (String s : res) {
            System.out.println(s);
        }

    }

}
