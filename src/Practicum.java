/*
🦉 Настало время разделить строку самостоятельно! Преобразуйте строку dollarAssets
в массив так, чтобы программа выдавала true при проверке его элементов.
*/
public class Practicum {
    public static void main(String[] args) {
        String dollarAssets = "Акции$Облигации$Фонды$";

        String[] split = dollarAssets.split("\\$"); // разбейте строку dollarAssets

        System.out.println(split[0].equals("Акции"));
        System.out.println(split[1].equals("Облигации"));
        System.out.println(split[2].equals("Фонды"));
    }
}