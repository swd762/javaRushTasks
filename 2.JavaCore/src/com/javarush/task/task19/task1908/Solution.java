package com.javarush.task.task19.task1908;

/* 
Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки.

Пример тела файла:
12 text var2 14 8ю 1

Результат:
12 14 1


Требования:
1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором принимающим FileReader).
4. Поток чтения из файла (BufferedReader) должен быть закрыт.
5. Программа должна записывать во второй файл все числа, через пробел, из первого файла (используй BufferedWriter с конструктором FileWriter).
6. Поток записи в файл (BufferedWriter) должен быть закрыт.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();//"d:\\1.txt";
        String outputFile = reader.readLine();// "d:\\2.txt";
        reader.close();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = fileReader.readLine()) != null) {
                sb.append(line);
            }
            String[] str = sb.toString().split(" ");
            for (int i = 0; i < str.length; i++) {
                if (str[i].matches("\\d+")) {
                    fileWriter.write(str[i] + " ");
                }
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
