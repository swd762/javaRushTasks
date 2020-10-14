package com.javarush.task.task17.task1710;

import javax.sound.midi.Soundbank;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1

    }

    public static Sex ConvertSex(String x) {
        if (x.equals("м")) {
            return Sex.MALE;
        } else return Sex.FEMALE;
    }


    public static void main(String[] args) throws Exception {
        //start here - начни тут
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person person = null;
        switch (args[0]) {
            case ("-c"):
                    person = Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3]));
                if (args[2].equals("м")) {

                    person.setSex(Sex.MALE);
                } else {

                    person.setSex(Sex.FEMALE);
                }
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
                break;
            case ("-u"):
                allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
              if (args[3].equals("м")) allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
              else allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);

              allPeople.get(Integer.parseInt(args[1])).setBirthDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4]));
              break;
            case ("-d"):
                allPeople.get(Integer.parseInt(args[1])).setSex(null);
                allPeople.get(Integer.parseInt(args[1])).setName(null);
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
                break;
            case ("-i"):
                Date date = allPeople.get(Integer.parseInt(args[1])).getBirthDate();
                String sex = null;
                if (allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.MALE)) sex = "м";
                    else sex = "ж";
                System.out.print(allPeople.get(Integer.parseInt(args[1])).getName());
                System.out.println(" " +  sex + " ");
                System.out.println(dateFormat.format(date));

        }





    }
}
