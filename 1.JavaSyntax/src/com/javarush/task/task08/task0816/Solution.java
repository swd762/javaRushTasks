package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Staone", df.parse("JUNE 1 1980"));
        map.put("Stall", df.parse("JUNE 1 1980"));
        map.put("Stal", df.parse("JUNE 1 1980"));
        map.put("Stae", df.parse("JUNE 1 1980"));
        map.put("Stalone", df.parse("JUNE 1 1980"));
        map.put("Stllone", df.parse("JUNE 1 1980"));
        map.put("Stlone", df.parse("JUNE 1 1980"));
        map.put("Stone", df.parse("JUNE 1 1980"));
        map.put("Swartzneger", df.parse("SEP 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

        Iterator<HashMap.Entry<String,Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            HashMap.Entry<String, Date> mappy = iterator.next();

            if (mappy.getValue().getMonth()>4 && mappy.getValue().getMonth()<8)   iterator.remove();


        }




    }

    public static void main(String[] args)  {


    }
}
