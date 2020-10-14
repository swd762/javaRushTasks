package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }



    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private int height;
        private String profession;
        private String sex;
        private String citizen;


        public Human(String name, int huy) {
            this.name = name;
            huy = huy;
        }

        public Human(String name, int huy, int pizda) {
            this.name = name;
            huy = huy;
            pizda = pizda;
        }





        public Human(String name) {
            this.name = name;
        }



        public Human(String name, int age, String sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;

        }



        public Human(String name, int age, String sex, String profession) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.profession = profession;

        }

        public Human(String name, int age, String sex, String profession, String citizen) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.profession = profession;
            this.citizen = citizen;

        }

        public Human(String name, int age, int height, String sex, String profession, String citizen) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.sex = sex;
            this.profession = profession;
            this.citizen = citizen;

        }

        public Human(String name, int age, int height, String sex, String profession, String citizen, boolean pidor) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.sex = sex;
            this.profession = profession;
            this.citizen = citizen;
            pidor = pidor;

        }

        public Human(String name, int age, int height, String sex, String profession, String citizen, boolean pidor, boolean govno) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.sex = sex;
            this.profession = profession;
            this.citizen = citizen;
            pidor = pidor;
            govno = govno;

        }

        public Human(String name, int age, int height, String sex, String profession, String citizen, boolean pidor, boolean govno, int huy) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.sex = sex;
            this.profession = profession;
            this.citizen = citizen;
            pidor = pidor;
            govno = govno;
            huy= huy;
        }

    }
}
