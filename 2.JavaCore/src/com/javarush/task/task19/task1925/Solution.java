package com.javarush.task.task19.task1925;

/* 
Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6.
В конце файла2 запятой не должно быть.
Закрыть потоки.

Пример выходных данных в файл2:
длинное,короткое,аббревиатура


Требования:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна записывать через запятую во второй файл все слова из первого файла длина которых строго больше 6(используй FileWriter).
5. Поток записи в файл (FileWriter) должен быть закрыт.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader(args[0]);
             FileWriter fileWriter = new FileWriter(args[1])) {
            StringBuilder sb = new StringBuilder();
            StringBuilder result = new StringBuilder();
            int s = 0;
            while (fileReader.ready()) {
                s = fileReader.read();
                if (s == 10) s = 32;
                sb = sb.append((char)s);

            }

            Pattern pattern = Pattern.compile("\\S{7,}");
            Matcher matcher = pattern.matcher(sb.toString());

            while (matcher.find()) {
                result.append(sb.substring(matcher.start(), matcher.end())).append(",");
            }
            result.deleteCharAt(result.length()-1);

            fileWriter.write(result.toString().toCharArray());
            fileWriter.close();
            fileReader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
}
