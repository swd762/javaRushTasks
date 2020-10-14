package com.javarush.task.task19.task1907;

/* 
Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки.


Требования:
1. Программа должна считывать имя файла с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое файла (используй FileReader c конструктором принимающим String).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна выводить в консоль количество слов "world", которые встречаются в файле.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
//        String inputFile = "d:\\1.txt";
        reader.close();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFile))) {
            String buffer;
            int count = 0;
            while ((buffer = fileReader.readLine())!=null) {
//                System.out.println(buffer);
                String[] lines = buffer.split("[\\p{Punct}\\p{Space}]");
                for (int i = 0; i <lines.length ; i++) {
                    if (lines[i].equals("world")) {
                        count++;
                    }
                }
            }
            fileReader.close();
            System.out.println(count);


        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
}
