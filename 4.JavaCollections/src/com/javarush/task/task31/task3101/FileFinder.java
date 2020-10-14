package com.javarush.task.task31.task3101;

import java.io.File;
import java.util.TreeMap;

public class FileFinder {

    public static TreeMap<String, File> map = new TreeMap<>();

    public static void findFiles(File dir) {
        if (dir.isDirectory()) {
            for (File file : dir.listFiles()) {
                if (file.isDirectory()) {
                    FileFinder.findFiles(file);
                } else if (file.length()<=50)  {
                    FileFinder.map.put(file.getName(), file);
                }
            }
        }
    }
}
