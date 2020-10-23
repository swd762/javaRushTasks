package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* 
Генератор паролей
Реализуй логику метода getPassword, который должен возвращать ByteArrayOutputStream, в котором будут байты пароля.
Требования к паролю:
1) 8 символов.
2) только цифры и латинские буквы разного регистра.
3) обязательно должны присутствовать цифры, и буквы разного регистра.
Все сгенерированные пароли должны быть уникальные.

Пример правильного пароля:
wMh7smNu


Требования:
1. Класс Solution должен содержать метод getPassword(), который возвращает ByteArrayOutputStream со сгенерированным паролем.
2. Длина пароля должна составлять 8 символов.
3. Пароль должен содержать хотя бы одну цифру.
4. Пароль должен содержать хотя бы одну латинскую букву нижнего регистра.
5. Пароль должен содержать хотя бы одну латинскую букву верхнего регистра.
6. Пароль не должен содержать других символов, кроме цифр и латинских букв разного регистра.
7. Сгенерированные пароли должны быть уникальными.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());

    }

    public static ByteArrayOutputStream getPassword() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Random random = new Random();


        while (true) {
            String passStr = "";
            int count = 0;
            while (count < 8) {
                String test = Character.toString((char) random.nextInt(123));
                if (test.matches("[a-z]||[A-Z]||[0-9]")) {
                    count++;
                    passStr += test;
                }
            }
            if (passStr.matches("(.*[0-9]+.*)")&&passStr.matches("(.*[A-Z]+.*)")&&passStr.matches("(.*[a-z]+.*)")) {
                out.write(passStr.getBytes());
                return out;
            }

        }
    }
}