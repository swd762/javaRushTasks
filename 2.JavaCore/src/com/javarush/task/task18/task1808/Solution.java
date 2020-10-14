package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream stream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream result1 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream result2 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        int num = stream.available();
        byte[] buff = new byte[num];


            int count = stream.read(buff);
            if (count % 2 != 0) count++;
            result1.write(buff,0 ,count/2);
            try {
                result2.write(buff, count / 2, num-count / 2);
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println(Math.round(count / 2));
            }


        stream.close();
        result1.close();
        result2.close();
    }
}
