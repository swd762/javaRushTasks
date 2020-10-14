package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    public void initialize(int left, int top, int width, int height) {
        this.left =left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize(int left, int top) {
        this.left =left;
        this.top = top;
        this.width = this.height = 0 ;

    }

    public void initialize(int left, int top, int width) {
        this.left =left;
        this.top = top;
        this.width = this.height = width;

    }

    public void initialize(Rectangle otherRectangle) {
        this.left = otherRectangle.left;
        this.top = otherRectangle.top;
        this.width = otherRectangle.width;
        this.height = otherRectangle.height;

    }


    public static void main(String[] args) {

    }
}
