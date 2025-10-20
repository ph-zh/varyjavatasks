/*
🦉 Объявите несколько стандартных коллекций, используя дженерики:
1) список трат пользователя expenses;
2) список имён домашних животных pets;
3) хеш-таблицу persons, которая будет хранить имена пользователей и их возраст.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practicum {

    public static void main(String[] args) {
        // Укажите тип данных, который будет храниться в списке
        List<Double> expenses = new ArrayList<>();
        expenses.add(100.5);
        expenses.add(500.0);
        expenses.add(1000.6);

        System.out.println("Траты пользователя:");
        for(Double expense : expenses) {
            System.out.println(expense);
        }

        // Объявите список pets
        List<String> pets = new ArrayList<>();
        pets.add("Кот");
        pets.add("Хомяк");
        pets.add("Кролик");

        System.out.println("Список домашних животных:");
        for(String pet : pets) {
            System.out.println(pet);
        }

        // Объявите хэш-таблицу persons
        Map<String, Integer> persons = new HashMap<>();
        persons.put("Ваня", 30);
        persons.put("Маша", 25);
        persons.put("Петя", 19);

        for (String person : persons.keySet()) {
            System.out.printf("%s - %d лет\n", person, persons.get(person));
        }
    }
}