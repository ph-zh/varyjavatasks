/*
 1/ Добавьте в класс Praktikum две новые команды меню:
 - «6 — Очистить список трат»;
 - «7 — Найти и удалить трату».
 2/ Новые команды должны обращаться к методам класса ExpensesManager — напишите их:
 - метод removeAllExpenses() должен очищать список трат и печатать фразу «Список трат пуст».
 - метод removeExpense(int transaction) должен проверять, содержится ли указанное
 пользователем значение в списке.
Если в списке нет ни одной траты, то нужно сообщить пользователю, что «Список трат пуст».
Если трата найдена, то её нужно удалить и сообщить об этом.
Если указанной суммы расходов в списке нет, то нужно вывести на экран, что «Такой траты нет».
 - В этом задании мы добавляем функцию поиска. Так как поиск по значению
 траты не будет точным (ведь могут существовать периодические одинаковые траты,
а сравнение чисел Double на одинаковость не может быть гарантировано),
мы предлагаем перейти к использованию класса-контейнера для значения трат
и для хранения уникального номера этой траты (назовём его номером транзакции).
 - Чтобы удалить элемент, вам потребуется вычислить его индекс — используйте для этого цикл
и не забудьте его прервать. Найденный индекс сохраните в переменную index.
Обратите внимание, несмотря на наличие метода remove для элемента, в этом задании
мы предлагаем удалять первый найденный элемент по индексу.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();
        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        Converter converter = new Converter(78.5, 88.7, 0.75);
        DinnerAdvisor dinnerAdvisor = new DinnerAdvisor();
        ExpensesManager expensesManager = new ExpensesManager();

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Ваши сбережения: " + moneyBeforeSalary + " RUB");
                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
                int currency = scanner.nextInt();
                converter.convert(moneyBeforeSalary, currency);
            } else if (command == 2) {
                dinnerAdvisor.getAdvice(moneyBeforeSalary, daysBeforeSalary);
            } else if (command == 3) {
                System.out.println("Введите размер траты:");
                double expense = scanner.nextDouble();
                moneyBeforeSalary = expensesManager.saveExpense(moneyBeforeSalary, expense);
            } else if (command == 4) {
                expensesManager.printAllExpenses();
            } else if (command == 5) {
                System.out.println("Самая большая сумма расходов составила " + expensesManager.findMaxExpense() + " руб.");
            } else if (command == 6) { // Добавьте реализацию команды 6
                // Вызовите соответствующий метод
                expensesManager.removeAllExpenses();
            } else if (command == 7) { // Добавьте реализацию команды 7
                System.out.println("Введите транзакцию:");
                int transaction = scanner.nextInt(); // Считайте значение транзакции
                // Вызовите соответствующий метод
                expensesManager.removeExpense(transaction);
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Конвертировать валюту");
        System.out.println("2 - Получить совет");
        System.out.println("3 - Ввести трату");
        System.out.println("4 - Показать траты");
        System.out.println("5 - Показать самую большую сумму расходов");
        // Добавьте новые пункты в меню:
        // "6 - Очистить список трат"
        // "7 - “Найти и удалить трату"
        System.out.println("6 - Очистить список трат");
        System.out.println("7 - Найти и удалить трату");
        System.out.println("0 - Выход");
    }
}