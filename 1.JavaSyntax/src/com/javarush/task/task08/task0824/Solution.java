package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> people = new ArrayList<>();
        Human child1 = new Human("child1", 10, false);
        Human child2 = new Human("child2", 11, true);
        Human child3 = new Human("child3", 20, false);

        Human father = new Human("Father", 45,true);
        Human mother = new Human("Mother", 40,false);

        Human ded1 = new Human("Ded1", 80, true);
        Human ded2 = new Human("Ded2", 80, true);

        Human babka1 = new Human("Babka1", 75, false);
        Human babka2 = new Human("Babka2", 75, false);

        babka1.children.add(father);
        ded1.children.add(father);
        babka2.children.add(mother);
        ded2.children.add(mother);

        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);

        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);

        people.add(child1);
        people.add(child2);
        people.add(child3);
        people.add(father);
        people.add(mother);
        people.add(ded1);
        people.add(ded2);
        people.add(babka1);
        people.add(babka2);

        for (Human s: people
             ) {
            System.out.println(s);
        }






    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human (String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }



        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
