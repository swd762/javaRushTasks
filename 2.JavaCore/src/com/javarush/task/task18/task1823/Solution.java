package com.javarush.task.task18.task1823;



import javax.crypto.spec.PSource;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;


/* 
Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit".
Передайте имя файла в нить ReadThread.
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки.


Требования:
1. Программа должна считывать имена файлов с консоли, пока не будет введено слово "exit".
2. Для каждого файла создай нить ReadThread и запусти ее.
3. После запуска каждая нить ReadThread должна создать свой поток для чтения из файла.
4. Затем нити должны найти максимально встречающийся байт в своем файле и добавить его в словарь resultMap.
5. Поток для чтения из файла в каждой нити должен быть закрыт.


*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        try {
           while (true) {
               fileName = reader.readLine();
               if (!fileName.equals("exit")) {
                   new ReadThread(fileName).start();
               } else break;
           }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static class ReadThread extends Thread {
        String fileName;
        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;

        }
        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public void run() {
            try (FileInputStream fis = new FileInputStream(fileName)) {
                byte[] bytesList = new byte[fis.available()];
                fis.read(bytesList);
                int maxCount = 0;
                int count = 0;
                byte maxByte = 0;
                for (int i = 0; i <bytesList.length ; i++) {
                    for (int j = 0; j <bytesList.length ; j++) {
                        if (bytesList[i] == bytesList[j]) count++;
                    }
                    if (count>maxCount) {
                        maxCount = count;
                        maxByte = bytesList[i];
                    }
                    count = 0;
                }
                
                resultMap.put(fileName, (int)maxByte);
//                System.out.println(maxCount);
//                System.out.println(maxByte);
//
//                System.out.println(" ");
//                for (int i = 0; i <bytesList.length; i++) {
//                    Arrays.sort(bytesList);
//                    System.out.print(bytesList[i] + " ");
//                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }






        }
    }
}
