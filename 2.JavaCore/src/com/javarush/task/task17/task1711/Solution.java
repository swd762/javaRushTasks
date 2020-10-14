package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        switch (args[0]) {
            case "-c":
                synchronized (allPeople){
                    create(args);}
                break;
            case "-u":
                synchronized (allPeople){
                    update(args);}
                break;
            case "-d":
                synchronized (allPeople){
                    delete(args);}
                break;
            case "-i":
                synchronized (allPeople){
                    info(args);}
                break;
        }
    }
    public static void create(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        for (int i = 1; i <args.length ; i=i+3) {
            String name = args[i];
            String sex = args[i+1];

            Person person = null;
            Date date = simpleDateFormat.parse(args[i+2]);
            person = sex.equals("м")? Person.createMale(name, date):Person.createFemale(name, date);
            allPeople.add(person);
            System.out.println(allPeople.indexOf(person));

        }
    }

    public static void update (String[] args) throws ParseException {
        for (int i = 1; i <args.length ; i=i+4) {
            if (args[i+2].equals("м"))
                allPeople.set(Integer.parseInt(args[i]), Person.createMale(args[i+1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i+3])));
            else if (args[i+2].equals("ж"))
                allPeople.set(Integer.parseInt(args[i]), Person.createFemale(args[i+1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i+3])));
        }
    }

    public static void delete (String[] args) {
        for (int i = 1; i <args.length ; i++) {
            allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);
            allPeople.get(Integer.parseInt(args[i])).setName(null);
            allPeople.get(Integer.parseInt(args[i])).setSex(null);
        }
    }

    public static void info (String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        for (int i = 1; i <args.length ; i++) {
            String sex1 = "";
            if (allPeople.get(Integer.parseInt(args[i])).getSex().equals(Sex.MALE))
                sex1 = "м";
            if (allPeople.get(Integer.parseInt(args[i])).getSex().equals(Sex.FEMALE))
                sex1 = "ж";

            System.out.println(allPeople.get(Integer.parseInt(args[i])).getName()+ " " + sex1 + " " + simpleDateFormat.format(allPeople.get(Integer.parseInt(args[i])).getBirthDate()));
        }

    }
}
