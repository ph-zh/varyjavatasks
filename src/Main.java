/*

*/
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> expenses = new ArrayList<>();
        expenses.add(120.23);
        expenses.add(290.32);
        expenses.add(420.03);
        boolean isExp = expenses.contains(290.32); // Проверяем наличие элемента
        if (isExp == false) {
            expenses.add(1,290.32); // Если элемента нет - его нужно добавить
            System.out.println("Трата " + expenses.get(1) + " рублей добавлена!");
        } else {
            System.out.println("Все расходы учтены!");
        }
    }
}