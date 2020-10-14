package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/
//Объединение файлов
//        Считать с консоли 2 имени файла.
//        В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
//        Закрыть потоки.
//
//
//        Требования:
//        1. Программа должна два раза считать имена файлов с консоли.
//        2. Не используй в программе статические переменные.
//        3. Для первого файла создай поток для чтения и считай его содержимое.
//        4. Затем, для первого файла создай поток для записи(поток для записи должен быть один). Для второго - для чтения.
//        5. Содержимое первого и второго файла нужно объединить в первом файле.
//        6. Сначала должно идти содержимое второго файла, затем содержимое первого.
//        7. Созданные для файлов потоки должны быть закрыты.



import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
//        String filenames = "d:\\1.txt\nd:\\2.txt\nd:\\3.txt";
//        System.setIn(new ByteArrayInputStream(filenames.getBytes()));
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String name1 = read.readLine();
        String name2 = read.readLine();
        read.close();

        FileInputStream in1 = new FileInputStream(name1);
        byte[] buffer1 = new byte[in1.available()];
        int count1 = in1.read(buffer1);
        in1.close();

        FileOutputStream out = new FileOutputStream(name1);

        FileInputStream in2 = new FileInputStream(name2);
        byte[] buffer2 = new byte[in2.available()];
        int count2 = in2.read(buffer2);
        in2.close();

        out.write(buffer2, 0, buffer2.length);
        out.write(buffer1, 0, buffer1.length);
        out.close();
    }
}
