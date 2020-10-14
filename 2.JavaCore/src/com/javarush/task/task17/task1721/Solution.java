package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();


    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader filereader1 = new BufferedReader(new FileReader(new File(reader.readLine())));
        BufferedReader filereader2 = new BufferedReader(new FileReader(new File(reader.readLine())));
        String temp = null;
        while ((temp = filereader1.readLine())!=null){

            allLines.add(temp);
        }
        while ((temp = filereader2.readLine())!=null){

            forRemoveLines.add(temp);
        }

        Solution abd = new Solution();
        try {
            abd.joinData();
        }
        catch (CorruptedDataException e){
        }
        reader.close();
        filereader1.close();
        filereader2.close();
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines))
            allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();

        }

    }
}