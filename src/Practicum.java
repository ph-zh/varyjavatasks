/*

*/

import java.util.ArrayList;
import java.util.Collection; // импортируем интерфейс Collection

public class Practicum {

    public static void main(String[] args) {
        final Collection<String> colors = new ArrayList<>();
        colors.add("Жёлтый");
        colors.add("Красный");
        colors.add("Зелёный");

        System.out.println("Список содержит Зелёный: " + colors.contains("Зелёный"));

        colors.remove("Жёлтый");
        System.out.println(colors);

        System.out.println("Оставшееся количество элементов: " + colors.size());
        System.out.println("Коллекция пустая? " + colors.isEmpty());
    }
}