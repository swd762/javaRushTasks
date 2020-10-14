package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        reader.close();
        BufferedReader f_input = null;

        ArrayList<Integer> numbers = new ArrayList<>();
        try {
            f_input = new BufferedReader(new InputStreamReader(fileInputStream));

            while(f_input.ready()) {
                int x = Integer.parseInt(f_input.readLine());
                if (x % 2 == 0) {
                    numbers.add(x);
                }

            }

            Collections.sort(numbers);

            for (Integer x: numbers){
                System.out.println(x);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            f_input.close();
        }


    }
}
