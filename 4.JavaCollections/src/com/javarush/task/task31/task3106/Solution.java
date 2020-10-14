package com.javarush.task.task31.task3106;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* 
Разархивируем файл
В метод main приходит список аргументов.
Первый аргумент - имя результирующего файла resultFileName, остальные аргументы - имена файлов fileNamePart.
Каждый файл (fileNamePart) - это кусочек zip архива. Нужно разархивировать целый файл, собрав его из кусочков.
Записать разархивированный файл в resultFileName.
Архив внутри может содержать файл большой длины, например, 50Mb.
Внутри архива может содержаться файл с любым именем.

Пример входных данных. Внутри архива находится один файл с именем abc.mp3:
C:/result.mp3
C:/pathToTest/test.zip.003
C:/pathToTest/test.zip.001
C:/pathToTest/test.zip.004
C:/pathToTest/test.zip.002


Требования:
1. В методе main нужно создать ZipInputStream для архива, собранного из кусочков файлов. Файлы приходят аргументами в main, начиная со второго.
2. Создай поток для записи в файл, который приходит первым аргументом в main. Запиши туда содержимое файла из архива.
3. Поток для чтения из архива должен быть закрыт.
4. Поток для записи в файл должен быть закрыт.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        // сортировка части входного массива с файлами
        List<String> filesList = new ArrayList<>();
        String newFileName = args[0];
        Collections.addAll(filesList, args);
        filesList.remove(0);
        Collections.sort(filesList);

        //System.out.println(filesList);
        List<InputStream> Files = new ArrayList<>();
        for (String file: filesList) {
            InputStream is = new FileInputStream(file);
            Files.add(is);
        }

        SequenceInputStream sis = new SequenceInputStream(Collections.enumeration(Files));
        ZipInputStream zis = new ZipInputStream(sis);

        FileOutputStream fos = new FileOutputStream(newFileName);

        while (zis.getNextEntry() != null) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = zis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
                fos.flush();
            }
            zis.closeEntry();

        }
        zis.close();
        fos.close();
    }
}
