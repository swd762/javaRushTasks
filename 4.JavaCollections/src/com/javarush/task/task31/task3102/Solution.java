package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

/* 
Находим все файлы
Реализовать логику метода getFileTree, который должен в директории root найти список всех файлов включая вложенные.
Используй очередь, рекурсию не используй.
Верни список всех путей к найденным файлам, путь к директориям возвращать не надо.
Путь должен быть абсолютный.


Требования:
1. Метод getFileTree должен принимать аргументом String root, по которому нужно найти все вложенные файлы.
2. Метод getFileTree должен возвращать список строк.
3. Нужно реализовать метод getFileTree: найти все файлы по указанному пути и добавить их в список.
4. Метод getFileTree должен быть вызван только 1 раз (рекурсию не использовать).
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> filesList = new ArrayList<>();

        File rootPath = new File(root);

        Queue<File> fileQueue = new ArrayDeque<>();
        fileQueue.add(rootPath);

        while(!fileQueue.isEmpty()) {
            File current = fileQueue.remove();

                if (current.isDirectory()) {
                    fileQueue.addAll(Arrays.asList(current.listFiles()));
                } else {
                    filesList.add(String.valueOf(current.getAbsoluteFile()));
                }
        }

        return filesList;

    }

    public static void main(String[] args) throws Exception {
        String rootPath = "d:\\jv";
        System.out.println(getFileTree(rootPath));

    }
}
