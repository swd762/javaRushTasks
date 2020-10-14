package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();                  //создаем мапу
        map.put("Удалить", "Маша");
        map.put("Оставить", "Оля");
        map.put("Удалить1", "Маша");
        map.put("Оставить1", "Толя");
        map.put("Удалить4", "Саша");
        map.put("Оставить3", "Женя");
        map.put("Удалить2", "Саша");
        map.put("Оставить4", "Сева");
        map.put("Удалить3", "Саша");
        map.put("Оставить2", "Лена");

        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> copyMap1 = new HashMap<>(map);          //создаем копию мапы
        ArrayList<String> copyValues = new ArrayList<>(map.values());       //создаем лист со значениями из мапы


        for (String value : copyValues) {                                   //проходим по всему листу со значениями
            int count = 0;                                                  //создаем счетчик для повторов
            for (Map.Entry<String, String> pair : copyMap1.entrySet()) {    //проходим по копии мапы
                if (value.equals(pair.getValue())) {                        //если значение из листа совпадает со значением из мапы
                    count++;                                                //счетчик прибавляется
                }
                if (count >  1) {                                           //в первом проходе будут сравниваться два первых элемента
                    //они будут одинаковые. счетчик =1; со второго элемента если будут совпадения
                    //счтчик будет равен двум и будет вызван метод удаления из мапы
                    removeItemFromMapByValue(map, value);
                }
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

        Map<String,String> copy1 = new HashMap<> (createMap());
//        System.out.println(copy1);                                          //это наш изначальный словарь, с дублирующимися именами
        removeTheFirstNameDuplicates(copy1);                                //удаляем повторы
//        System.out.println(copy1);
    }
}
