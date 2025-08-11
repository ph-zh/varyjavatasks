/*
В таблице хранятся названия стран и их столицы. Напечатайте названия столиц Аргентины и Норвегии.
*/
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> countriesCapitals = new HashMap<>();
        countriesCapitals.put("Франция", "Париж");
        countriesCapitals.put("Аргентина", "Буэнос-Айрес");
        countriesCapitals.put("Россия", "Москва");
        countriesCapitals.put("Америка", "Вашингтон");
        countriesCapitals.put("Япония", "Токио");
        countriesCapitals.put("Норвегия", "Осло");

        System.out.println("Столица Аргентины: " + countriesCapitals.get("Аргентина"));
        System.out.println("Столица Норвегии: " + countriesCapitals.get("Норвегия"));

    }
}