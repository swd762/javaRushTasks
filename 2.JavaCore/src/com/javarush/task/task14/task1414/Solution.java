package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key;
        ArrayList<Movie> list = new ArrayList<>();
        Movie movie;
        try {
            while (true) {
                key = reader.readLine();
                movie = MovieFactory.getMovie(key);
                if (movie != null) {
                    System.out.println(movie.getClass().getSimpleName());
                }
                list.add(movie);
                switch (key) {
                    case "cartoon":
                        break;
                    case "thriller":
                        break;
                    case "soapOpera":
                        break;
                    default:
                     throw new NullPointerException();
                }
            }
        }
        catch (NullPointerException e) {

        }

        finally {
            reader.close();
        }
//        for (Movie x: list
//             ) {
//            if (x != null) {
//                System.out.println(x.getClass().getSimpleName());
//            }
//        }
        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory  {

        static Movie getMovie(String key) throws Exception {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {


    }

    static class SoapOpera extends Movie {
    }

    //Напишите тут ваши классы, пункт 3
    static class Cartoon extends Movie {
    }
    static class Thriller extends Movie {
    }

}
