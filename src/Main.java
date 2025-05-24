/*
Изучите код программы, которая автоматически заполняет массив расходов за неделю. Найдите и исправьте допущенные ошибки.
 */

class Main {
    public static void main(String[] args) {
        double[] expenses = new double[7]; // Объявили массив трат за неделю (7 дней)

        double expense = 50; // В первый день потрачено 50 рублей

        // Заполнили массив, используя цикл for
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = expense;
            expense = expense + 100;
        }
        System.out.println(expense);
        System.out.println("Ошибок нет. Все расходы успешно занесены в приложение!");
    }
}