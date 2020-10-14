package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


      double [] a = new double[4];

      for (int i=0;i<a.length;i++) {
          a[i] = Double.parseDouble(reader.readLine());

      }
        double f = a[0];

      for (int i=1;i<a.length;i++) {
          if (f<a[i]) f=a[i];

      }

        System.out.println(f);



    }
}
