package com.javarush.task.task18.task1817;

/* 
Пробелы
*/
//Пробелы
//        В метод main первым параметром приходит имя файла.
//        Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45.
//        1. Посчитать количество всех символов.
//        2. Посчитать количество пробелов.
//        3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой.
//        4. Закрыть потоки.
//
//
//        Требования:
//        1. Считывать с консоли ничего не нужно.
//        2. Создай поток чтения из файла, который приходит первым параметром в main.
//        3. Посчитай отношение пробелов ко всем символам в файле и выведи в консоль это число.
//        4. Выведенное значение необходимо округлить до 2 знаков после запятой.
//        5. Поток чтения из файла должен быть закрыт.

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int countAll = 0;
        int countSpaces = 0;
        double coutAbs = 0;
        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);
        for (byte i: bytes) {
            countAll++;
            if (i == 32)  countSpaces++;
        }
        fileInputStream.close();
//        System.out.println(countAll);
//        System.out.println(countSpaces);
        String out = String.format("%.2f", (double)countSpaces/(double)countAll * 100);
        System.out.println(out);
    }
}
