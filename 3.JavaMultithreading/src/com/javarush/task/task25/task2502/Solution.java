package com.javarush.task.task25.task2502;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
Машину на СТО не повезем!
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {

        protected List<Wheel> wheels;

        public Car() {
            //init wheels here
            Set<Wheel> wheelSet = new HashSet<>(4);
            String[] wheelNames = loadWheelNamesFromDB();
            if (wheelNames.length != 4) {
                throw new IllegalArgumentException();
            }
            for (String wheel : wheelNames) {
                wheelSet.add(Wheel.valueOf(wheel));
            }

            wheels = new ArrayList<>(wheelSet);

        }


        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }

    }

}
