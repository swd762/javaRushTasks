package com.javarush.task.task20.task2014;

import java.io.*;
import java.rmi.server.ExportException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
Сериализуй класс Solution.
Подумай, какие поля не нужно сериализовать, пометь ненужные поля модификатором transient.
Объект всегда должен содержать актуальные итоговые данные.
Метод main не участвует в тестировании.

Написать код проверки самостоятельно в методе main:
1) создать файл, открыть поток на чтение (input stream) и на запись(output stream);
2) создать экземпляр класса Solution - savedObject;
3) записать в поток на запись savedObject (убедитесь, что они там действительно есть);
4) создать другой экземпляр класса Solution с другим параметром;
5) загрузить из потока на чтение объект - loadedObject;
6) проверить, что savedObject.string равна loadedObject.string;
7) обработать исключения.


Требования:
1. Поле pattern должно быть отмечено модификатором transient.
2. Поле currentDate должно быть отмечено модификатором transient.
3. Поле temperature должно быть отмечено модификатором transient.
4. Поле string НЕ должно быть отмечено модификатором transient.
*/
public class Solution implements Serializable {
    public static void main(String[] args) throws Exception {
        System.out.println(new Solution(4));
        File file = File.createTempFile("tmp_file", null,null);
        Solution savedObject = null;
        Solution loadedObject = null;
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            savedObject = new Solution(44);
            out.writeObject(savedObject);
            out.flush();
        }
        catch (Exception e) {
            e.getMessage();
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            loadedObject = (Solution) in.readObject();
        }
        catch (Exception f) {
            f.getMessage();
        }


    }

    private final transient String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
