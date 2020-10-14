package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat Cat1 = new Cat("Vaska",10,30,20);
        Cat Cat2 = new Cat("Zaika",11,30,10);
        Cat Cat3 = new Cat("Zalupka",10,35,25);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}