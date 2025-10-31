/*
🦉 При помощи методов интерфейса List<T> преобразуйте исходный список кличек кошек в такой [Маркиз, Пирожок, Лев].
*/

import java.util.ArrayList;
import java.util.List;

public class Practicum {

    public static void main(String[] args) {

        final List<String> cats = new ArrayList<>();

        cats.add("Маркиз");
        cats.add("Принцесса");
        cats.add("Пирожок");
        cats.add("Мурка");

        cats.remove(1);
        cats.set(2, "Лев");
        System.out.println(cats); // сейчас печатается [Маркиз, Принцесса, Пирожок, Мурка]
    }
}