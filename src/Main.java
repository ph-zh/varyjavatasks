/*

 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество действий => ");
        int iterationsCount = scanner.nextInt();
// ----------- начало видимого кода сниппета
        for (int counter = 0; counter < iterationsCount; counter++) {
            System.out.println("1. Фундук");
            System.out.println("2. Арахис");
            System.out.println("3. Пекан");
            System.out.print("Введите тип орехов => ");
            int nutType = scanner.nextInt();
            System.out.print("Введите количество грамм => ");
            if (nutType == 1) {
                int weight = scanner.nextInt();
                calculateAndShowNutPrice("фундука", weight, 1680);
            } else if (nutType == 2) {
                int weight = scanner.nextInt();
                calculateAndShowNutPrice("арахиса", weight, 360);
            } else if (nutType == 3) {
                int weight = scanner.nextInt();
                calculateAndShowNutPrice("пекана", weight, 1299);
            }
            System.out.println(nutType);
        }
// ----------- конец видимого кода сниппета

    }

    public static void calculateAndShowNutPrice(String nutType, int weight, double price) {
        System.out.println("Вычисляем стоимость " + weight + " грамма(ов) " + nutType);
        double total = (weight * price) / 1000;
        System.out.println("Стоимость " + weight + " грамма(ов) " + nutType + " = " + total + "₽");
    }
}