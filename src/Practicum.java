/*
🦉 Допишите объявление класса Printer, который обеспечивает механизм работы принтера ценников в магазине:
из разных магазинов в него поступают цены товаров в копейках, а для печати на ценниках принтер преобразует цены в рубли.
 */

import java.util.ArrayList;
import java.util.List;

public class Practicum {

    public static void main(String[] args) {
        // Первый магазин продает дорогие товары и хочет передавать копейки типом Long
        List<Long> longList = new ArrayList<>();
        longList.add(Long.MAX_VALUE);

        new Printer<>(longList).print();

        // Второй магазин продает товары подешевле и использует для передачи копеек тип Integer
        List<Integer> intList = new ArrayList<>();
        intList.add(100000);

        new Printer<>(intList).print();

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");

        // Этот вариант должен вызывать ошибку компиляции
        // new Printer<>(stringList).print();
    }

}

class Printer<T extends Number> {
    private final List<T> list;

    public Printer(List<T> list) {
        this.list = list;
    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            double price = list.get(i).doubleValue() / 100;
            System.out.println("Цена товара: " + price + " руб.");
        }
    }
}