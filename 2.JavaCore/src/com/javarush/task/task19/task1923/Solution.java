package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со словами, разделенными пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d.
Закрыть потоки.


Требования:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна записывать во второй файл все слова из первого файла которые содержат цифры (используй FileWriter).
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


        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]))) {
            String s = "";
            StringBuilder sb = new StringBuilder();

            while ((s = fileReader.readLine()) != null) {
                Pattern pattern = Pattern.compile("\\b[^\\s]*\\d+[^\\s]*\\b");
                Matcher matcher = pattern.matcher(s);
                while (matcher.find()) {
                    sb.append(s.substring(matcher.start(),matcher.end())).append(" ");
                }
            }

            fileWriter.write(sb.toString());


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
