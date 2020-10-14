package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> cats = new HashMap<>();
        Cat cat1 = new Cat("name1");
        Cat cat2 = new Cat("name2");
        Cat cat3 = new Cat("name3");
        Cat cat4 = new Cat("name4");
        Cat cat5 = new Cat("name5");
        Cat cat6 = new Cat("name6");
        Cat cat7 = new Cat("name7");
        Cat cat8 = new Cat("name8");
        Cat cat9 = new Cat("name9");
        Cat cat10 = new Cat("name10");
        cats.put(cat1.name, cat1);
        cats.put(cat2.name, cat2);
        cats.put(cat3.name, cat3);
        cats.put(cat4.name, cat4);
        cats.put(cat5.name, cat5);
        cats.put(cat6.name, cat6);
        cats.put(cat7.name, cat7);
        cats.put(cat8.name, cat8);
        cats.put(cat9.name, cat9);
        cats.put(cat10.name, cat10);

        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        HashSet<Cat> set = new HashSet<>();
        for (Map.Entry<String,Cat> m : map.entrySet()){
            set.add(m.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
