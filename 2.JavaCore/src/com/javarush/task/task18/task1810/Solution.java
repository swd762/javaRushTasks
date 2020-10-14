package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = null;

        while (true) {
            try {
                input = new FileInputStream(reader.readLine());

                if (input.available()<1000) {
                    input.close();
                    break;
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

        throw new DownloadException();

    }

    public static class DownloadException extends Exception {


    }
}
