/*
Исправьте код таким образом, чтобы метод sayHello() принимал параметр — имя того, с кем нужно поздороваться. Затем поздоровайтесь с Пикселем и Байтом, используя переменные в main.
*/

class Main {
    public static void main(String[] args) {
        sayHello("Пиксель");
        sayHello("Байт");
    }

    public static void sayHello(String usernanem) {
        System.out.println("Привет, " + usernanem);
    }
}