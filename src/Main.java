/*
Разбейте вычисление переменной а на четыре последовательные операции. Используйте дополнительную переменную c.
*/
public class Main {
    public static void main(String[] args) {
        int a = 13;
        int b = 3;
        ++a; //14
        int c = a % b; // 2
        a = a - c; // 14 - 2
        b++; // 4
        System.out.println(a + " и " + b);
    }
}