/*
Допишите код: импортируйте и объявите список, а затем заполните его элементами. Добавьте имя «Наталья» после имени «Екатерина» (не меняя строки кода местами). Результат напечатайте.
*/
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> femaleNames = new ArrayList<>(); // Создайте список
        femaleNames.add("Екатерина");
        femaleNames.add("Мария");
        femaleNames.add("Анна");
        femaleNames.add(1, "Наталья"); // Добавьте имя "Наталья"
        // Распечайте список
        System.out.println(femaleNames);
    }
}