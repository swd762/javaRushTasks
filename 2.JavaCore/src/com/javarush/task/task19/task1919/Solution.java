package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени.
Закрыть потоки.

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0


Требования:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое файла (используй FileReader).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна выводить в консоль каждое имя и сумму всех его значений, все данные должны быть отсортированы в возрастающем порядке по имени.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        HashMap <String, Double> employee = new HashMap<>();
        TreeMap<String, Double> tree = new TreeMap<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            String line = "";
            String employeeName = "";
            Double salary = 0.0;

            while((line = fileReader.readLine()) != null) {
                employeeName = line.split(" ")[0];
                salary = Double.parseDouble(line.split(" ")[1]);
                if (employee.containsKey(employeeName)) {
                    employee.put(employeeName, employee.get(employeeName) + salary);
                } else {
                    employee.put(employeeName, salary);
                }
            }

        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        tree.putAll(employee);

        for (Map.Entry<String, Double> entry: tree.entrySet()
        ) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
