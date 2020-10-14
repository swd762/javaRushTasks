package com.javarush.task.task19.task1920;

/* 
Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Вывести в консоль имена в алфавитном порядке, у которых максимальная сумма.
Имена разделять пробелом либо выводить с новой строки.
Закрыть потоки.

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров


Требования:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое файла (используй FileReader).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна выводить в консоль имена, у которых максимальная сумма.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) {

        HashMap<String, Double> map = new HashMap<String, Double>();
        TreeSet<String> tree = new TreeSet<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            String line = "";
            String name = "";
            Double cash = 0.0;
            String[] array;
            while ((line = fileReader.readLine()) != null) {
                array = line.split(" ");
                name = array[0];
                cash = Double.parseDouble(array[1]);

                if (map.containsKey(name)) {
                    map.put(name, map.get(name) + cash);
                } else {
                    map.put(name, cash);
                }
            }
            String maxKey = Collections.max(map.entrySet(), Comparator.comparingDouble(Map.Entry::getValue)).getKey();
            Double maxValue = map.get(maxKey);

            for (Map.Entry<String , Double> entry: map.entrySet()
                 ) {
                if (entry.getValue().equals(maxValue)) {
                    tree.add(entry.getKey());
                }
            }

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (String s: tree
             ) {
            System.out.println(s);
        }
//        System.out.println(map.toString());

    }

    public static boolean isSameName (HashMap <String, Double> map, String name) {

        return map.containsKey(name) ? true : false;
    }
}
