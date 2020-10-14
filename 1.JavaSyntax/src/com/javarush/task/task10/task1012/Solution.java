package com.javarush.task.task10.task1012;

import com.sun.javafx.collections.MappingChange;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
        Map<Character, Integer> output_list = new TreeMap<>();
        for (int i = 0; i <alphabet.size() ; i++) {
            output_list.put(alphabet.get(i),0);
        }

        //System.out.println(output_list);
        for (int i = 0; i <list.size() ; i++) {
            char[] symb = list.get(i).toCharArray();
            for (int j = 0; j <symb.length ; j++) {
                if (alphabet.contains(symb[j])) {
                    output_list.put(symb[j],output_list.get(symb[j])+1);
                }

            }
        }
        for (char c : alphabet) {
            System.out.println(c + " " + output_list.get(c));
        }
    }
}
