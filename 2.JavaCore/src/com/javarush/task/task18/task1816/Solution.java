package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/
//Английские буквы
//        В метод main первым параметром приходит имя файла.
//        Посчитать количество букв английского алфавита, которое есть в этом файле.
//        Вывести на экран число (количество букв).
//        Закрыть потоки.
//
//
//        Требования:
//        1. Считывать с консоли ничего не нужно.
//        2. Создай поток чтения из файла, который приходит первым параметром в main.
//        3. В файле необходимо посчитать буквы английского алфавита и вывести это число в консоль.
//        4. Нужно учитывать заглавные и строчные буквы.
//        5. Поток чтения из файла должен быть закрыт.

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception {
        String filename = args[0];
        int count = 0;
        FileInputStream fileInputStream = new FileInputStream(filename);
        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);
        for (byte i: bytes) {
                if ((i>64 && i<91) || (i>96 && i<123)) count++;

        }
        fileInputStream.close();
        System.out.println(count);
    }
}
