package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String granFatherName = reader.readLine();
        Cat catGranFather = new Cat(granFatherName);

        String granMotherName = reader.readLine();
        Cat catGranMother = new Cat(granMotherName);

        String FatherName = reader.readLine();
        Cat catFather = new Cat(FatherName, catGranMother, catGranFather);

        String MotherName = reader.readLine();
        Cat catMother = new Cat(MotherName, catGranMother, catGranFather);

        String SonName = reader.readLine();
        Cat catSon = new Cat(SonName, catMother, catFather);

        String douterName = reader.readLine();
        Cat catDouter = new Cat(douterName, catMother, catFather);

        System.out.println(catGranMother);
        System.out.println(catGranFather);
        System.out.println(catMother);
        System.out.println(catFather);
        System.out.println(catSon);
        System.out.println(catDouter);
    }

    public static class Cat {
        private String name;
        private Cat parentWoman;
        private Cat parentMan;

        Cat(String name) {

            this.name = name;
        }

        Cat(String name, Cat parentWoman)
        {
            this.name = name;
            this.parentWoman = parentWoman;
        }

        Cat(String name, Cat parentWoman, Cat parentMan)
        {
            this.name = name;
            this.parentWoman = parentWoman;
            this.parentMan = parentMan;
        }

        @Override
        public String toString() {
            if (parentWoman == null && parentMan == null) {
                return "The cat's name is " + name + ", no mother, no father";
            }

            if (parentWoman == null) return "The cat's name is " + name + ", no mother, father is " + parentMan.name;


            return "The cat's name is " + name + " ,mother name is " + parentWoman.name + " , father is " + parentMan.name;
        }

    }

}
