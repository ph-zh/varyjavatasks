/*
🦉 Исправьте предложенный код так, чтобы переменные a и b стали видны внутри метода findMaxOf16And5().
Решите эту задачу, не добавляя в метод параметры.
*/

class Main {
    public static void main(String[] args) {
        System.out.println("Наибольшее из чисел 16 и 5 = " + findMaxOf16And5());
    }

    public static int findMaxOf16And5() {
        int a = 16;
        int b = 5;
        if (a > b) {
            return a;
        }
        return b;
    }

}