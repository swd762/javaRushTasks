package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {

        printMatrix(2, 3, "8");
        printMatrix(2,3, 44);
        printMatrix(2.0,2,22);
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }



    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, int n, Integer value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(double m, int n, Integer value) {
        for (int i = 0; i < (int)m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, byte n, Object value) {
    }
    public static void printMatrix(int m, double n, Object value) {
    }
    public static void printMatrix(int m, char n, Object value) {
    }
    public static void printMatrix(double m, int n, Object value) {
    }
    public static void printMatrix(int m, float n, Object value) {
    }
    public static void printMatrix(long m, char n, Object value) {
    }

}
