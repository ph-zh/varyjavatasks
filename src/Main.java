/*
В таблице собраны имена клиентов зоомагазина и сумма, на которую они делали заказы. Посчитайте, сколько всего денег было потрачено на питомцев.
*/
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> orders = new HashMap<>();
        orders.put("Иван И.", 4345.5);
        orders.put("Ольга С.", 76564.43);
        orders.put("Александр Т.", 1234.86);
        orders.put("Александр Р.", 23432.87);
        orders.put("Екатерина О.", 1034753.6);
        orders.put("Ярослав В.", 450.0);

        double sum = 0; // Объявите переменную, где будет сохранена общая сумма
        for (Double order : orders.values()) { // Пройдитесь в цикле по значениям
            sum = sum + order;
        }

        System.out.println("Всего было совершено заказов на сумму: " + sum);
    }
}