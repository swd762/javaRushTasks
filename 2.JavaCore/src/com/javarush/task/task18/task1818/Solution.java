package com.javarush.task.task18.task1818;

/* 
Два в одном
*/
//Два в одном
//        Считать с консоли 3 имени файла.
//        Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
//        Закрыть потоки.
//
//
//        Требования:
//        1. Программа должна три раза считать имена файлов с консоли.
//        2. Для первого файла создай поток для записи. Для двух других - потоки для чтения.
//        3. Содержимое второго файла нужно переписать в первый файл.
//        4. Содержимое третьего файла нужно дописать в первый файл (в который уже записан второй файл).
//        5. Созданные для файлов потоки должны быть закрыты.

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
//        String filename = "d:\\1.txt\nd:\\2.txt\nd:\\3.txt";
//        System.setIn(new ByteArrayInputStream(filename.getBytes()));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine(), true);
        FileInputStream fileInputStream1 = new FileInputStream(reader.readLine());
        FileInputStream fileInputStream2 = new FileInputStream(reader.readLine());
        byte[] bytes1 = new byte[fileInputStream1.available()];
        byte[] bytes2 = new byte[fileInputStream2.available()];
        fileInputStream1.read(bytes1);
        fileInputStream2.read(bytes2);
        fileOutputStream.write(bytes1);
        fileOutputStream.write(bytes2);
        fileInputStream1.close();
        fileInputStream2.close();
        fileOutputStream.close();

    }
}
