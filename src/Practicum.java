/*
🦉 Напишите конструктор приветствия при помощи StringBuilder! Сначала создайте экземпляр StringBuilder, а затем добавьте в него три подстроки.
*/
public class Practicum {
    public static void main(String[] args) {

        String start = "Привет! Меня зовут ";

        StringBuilder hello = new StringBuilder(start); // создайте StringBuilder с началом start

        // добавьте подстроку "<ваше имя>"
        // добавьте подстроку ". Я из города "
        // добавьте подстроку "<ваш город>."
        hello.append("<ваше имя>");
        hello.append(". Я из города ");
        hello.append("<ваш город>.");

        String asString = hello.toString();
        System.out.println(asString);
    }
}