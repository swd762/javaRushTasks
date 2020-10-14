package com.javarush.task.task13.task1321;


/* 
Исправление ошибок
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(Hobby.HOBBY.toString());
        System.out.println(new Hobby().INDEX);
    }

    interface Desire {
    }

    interface Dream {

    }

    static class Hobby implements Dream, Desire {
        public static Hobby HOBBY = new Hobby();
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
