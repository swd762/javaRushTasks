package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> arrayList = new ArrayList<>();

        Human human_one = new Human("Аня", false, 21);
        arrayList.add(human_one);
        Human human_two = new Human("Вася", true, 21);
        arrayList.add(human_two);
        Human human_three = new Human("Саша", false, 21);
        arrayList.add(human_three);
        Human human_four = new Human("Женя", true, 22);
        arrayList.add(human_four);

        Human human_five = new Human("Женя", true, 22, human_two, human_one);
        arrayList.add(human_five);
        Human human_six = new Human("Женя", true, 22, human_two, human_one);
        arrayList.add(human_six);
        Human human_seven = new Human("Женя", true, 22, human_two, human_one);
        arrayList.add(human_seven);
        Human human_eight = new Human("Женя", true, 22, human_two, human_one);
        arrayList.add(human_eight);
        Human human_nine = new Human("Женя", true, 22, human_two, human_one);
        arrayList.add(human_nine);




        for (Human hum:arrayList
             ) {
            System.out.println(hum);

        }

    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }



        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}