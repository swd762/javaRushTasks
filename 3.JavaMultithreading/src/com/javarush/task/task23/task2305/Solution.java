package com.javarush.task.task23.task2305;

/* 
Inner
*/

public class Solution {

    public InnerClass[] innerClasses = new InnerClass[2];

    public static Solution[] getTwoSolutions() {
        Solution[] result = new Solution[2];
        Solution solution1 = new Solution();
        solution1.innerClasses[0] = solution1.new InnerClass();
        solution1.innerClasses[1] = solution1.new InnerClass();
        result[0] = solution1;
        Solution solution2 = new Solution();
        solution2.innerClasses[0] = solution2.new InnerClass();
        solution2.innerClasses[1] = solution2.new InnerClass();
        result[1] = solution2;
        return result;
    }

    public static void main(String[] args) {

    }

    public class InnerClass {
    }

}
