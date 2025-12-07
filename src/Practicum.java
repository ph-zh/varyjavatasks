/*

*/
public class Practicum {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(); // создали объект - изменяемую строку
        builder.append("Hello, ");
        builder.append("world!");

        String asString = builder.toString(); // сделали изменяемую строку неизменяемой
        builder.append("Frank");
        builder.append("Spignetti");
        System.out.println(asString); // выведет "Hello, world!"
    }
}