package com.javarush.task.task12.task1229;

/* 
Родитель класса CTO
*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static class SuperMan {
        public void workHard() {
            System.out.println("Work hard");
        }

    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO extends SuperMan implements Businessman  {

    }
}
