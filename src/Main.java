/*
Прочитайте код. Сейчас программа анализирует расходы на корм одновременно для двух питомцев:
кота Пикселя и хомяка Байта — из-за этого в результатах печати можно запутаться.
Декомпозируйте код — разбейте его отдельные методы: sayHello, sayEnjoyMeal, findMaxExpense и findExpensesSum.
Методы с приветствием и пожеланием приятного аппетита должны быть типа void;
методы, касающиеся анализа трат, должны возвращать значение.
У всех методов должны быть параметры. Внутри главного метода main(String[] args)
должны остаться массивы с тратами, вызов методов и вывод результатов трат.
Вызовите методы так, чтобы сначала была напечатана информация про Пикселя, а потом про Байта.
Порядок вывода такой: сперва приветствие, затем стоимость самого дорогого корма и
общие траты на него и только потом пожелание приятного аппетита.
 */
public class Main {
    public static void main(String[] args) {
        double[] feedExpensesCat = {100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4};
        double[] feedExpensesHamster = {70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4};

        sayHello("Пиксель");
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesCat));
        System.out.println("Всего на корм было потрачено " + findExpensesSum(feedExpensesCat));
        sayEnjoyMeal("Пиксель");

        sayHello("Байт");
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesHamster));
        System.out.println("Всего на корм было потрачено " + findExpensesSum(feedExpensesHamster));
        sayEnjoyMeal("Байт");
    }

    public static void sayHello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void sayEnjoyMeal(String name) {
        System.out.println("Приятного аппетита, " + name + "!");
    }

    public static double findMaxExpense(double[] feedExpenses) {
        double maxFeedExpense = 0;
        for (int i = 0; i < feedExpenses.length; i++) {
            if (feedExpenses[i] > maxFeedExpense) {
                maxFeedExpense = feedExpenses[i];
            }
        }
        return maxFeedExpense;
    }

    public static double findExpensesSum(double[] feedExpenses) {
        double sumFeed = 0;
        for (int i = 0; i < feedExpenses.length; i++) {
            sumFeed = sumFeed + feedExpenses[i];
        }
        return sumFeed;
    }
}