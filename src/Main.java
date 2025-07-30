/*
Допишите реализацию метода, который возвращает максимум двух чисел типа byte. Необходимо использовать метод Integer.max(int, int).
*/
public class Main {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(findMax(a, b));
    }

    private static byte findMax(byte firstNumber, byte secondNumber) {
        return (byte) Integer.max(firstNumber, secondNumber);
    }
}