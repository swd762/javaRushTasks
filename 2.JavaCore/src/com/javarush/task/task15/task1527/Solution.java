package com.javarush.task.task15.task1527;

import jdk.nashorn.internal.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов
*/

public class Solution {
        public static void main(String[] args) throws Exception {
            //String ss = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";
            // String ss = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo";
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String ss = reader.readLine();
            reader.close();
            String str1 = "";
            String value = "";
            boolean flag = false;
            String[] params = ss.substring(ss.indexOf('?') + 1).trim().split("&");
            for (String str: params) {
                if(str.indexOf("=")!=-1) {
                    str1 = str1 + " "+ str.substring(0,str.indexOf("="));
                } else {
                    str1 = str1 + " " + str;
                }
                if (str.indexOf("=")!=-1 && str.substring(0,str.indexOf("=")).equals("obj")) {
                   value = str.substring(str.indexOf("=") + 1,str.length());
                   flag = true;
                }
            }
            System.out.println(str1.trim());
            if (flag) {
                try {
                    alert(Double.parseDouble(value.substring(value.indexOf("=") + 1, value.length())));
                } catch (Exception e) {
                    alert(value.substring(value.indexOf("=") + 1, value.length()));
                }
            }
        }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
    }



