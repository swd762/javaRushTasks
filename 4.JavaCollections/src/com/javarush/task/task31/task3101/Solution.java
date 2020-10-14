package com.javarush.task.task31.task3101;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

/* 
Проход по дереву файлов
1. На вход метода main() подаются два параметра.
Первый - path - путь к директории, второй - resultFileAbsolutePath - имя (полный путь) существующего файла, который будет содержать результат.
2. Переименовать resultFileAbsolutePath в allFilesContent.txt (используй метод FileUtils.renameFile(), и, если понадобится, FileUtils.isExist()).
3. Для каждого файла в директории path и в ее всех вложенных поддиректориях выполнить следующее:
Если у файла длина в байтах НЕ больше 50, то для всех таких файлов:
3.1. Отсортировать их по имени файла в возрастающем порядке, путь не учитывать при сортировке.
3.2. В allFilesContent.txt последовательно записать содержимое всех файлов из п. 3.1. После каждого тела файла записать "\n".
Все файлы имеют расширение txt.
В качестве разделителя пути используй "/".
Для создания файлов используй конструктор File(String pathname).


Требования:
1. Файл, который приходит вторым параметром в main, должен быть переименован в allFilesContent.txt.
2. Нужно создать поток для записи в переименованный файл.
3. Содержимое всех файлов, размер которых не превышает 50 байт, должно быть записано в файл allFilesContent.txt в отсортированном по имени файла порядке.
4. Поток для записи в файл нужно закрыть.
5. Не используй статические переменные.
*/
public class Solution {
    public static void main(String[] args) {
        // первый аргумент - путь к директории
        String path = args[0].trim();
        // второй аргумент - путь к файлу результата
        String resultFileAbsolutePath = args[1].trim();
        // создаем объект dir
        File dir = new File(path);
        // создаем объект заданного файла с результатом
        File resultFile = new File(resultFileAbsolutePath);
        // создаем объект нового файла с результатом
        File resultFileNew = new File(resultFile.getParent() + "/allFilesContent.txt");
        // переименовываем файл с результатом в allFilesContent.txt, при этом проверяем существование источника
        if (FileUtils.isExist(resultFile)) {
            FileUtils.renameFile(resultFile, resultFileNew);
        }
        // выполняем метод для нахождения всех файлов в условии
        FileFinder.findFiles(dir);

        //
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(resultFileNew)))) {

            //BufferedReader reader = new BufferedReader(new InputStreamReader())
            for (Map.Entry<String, File> file : FileFinder.map.entrySet()) {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file.getValue())))) {
                    while(reader.ready()) {
                        writer.write(reader.read());
                    }
                    //reader.close();
                    writer.write('\n');
                } catch (IOException e) {

                }
            }

        } catch (IOException e) {

        }
//        FileWriter fileWriter = new FileWriter()


//        System.out.println(FileFinder.map);
//        System.out.println(path + " " + resultFileAbsolutePath + " " + resultFileNew);


    }

}
