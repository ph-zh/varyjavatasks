/*
Исправьте проблему с областью видимости переменной rateUSD.
Объявите её после переменной condition и там же инициализируйте — присвойте значение  78.8.
true
 */
class Main {
    public static void main(String[] args) {
        boolean condition = true;
        // Перенесите объявление переменной сюда
        double rateUSD = 78.8;

        if (condition) {
            System.out.println("Внутри блока курс доллара виден. Он равен " + rateUSD);
        }
        // Здесь переменная rateUSD не видна
        System.out.println("Вне блока курс доллара не виден. Должен быть " + rateUSD);
    }
}