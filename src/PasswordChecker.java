/*

*/
public class Practicum {
    public static void main(String[] args) {
        String blank = "   ";
        String notBlank = "Тут пробелы или строка?!";
        System.out.println(blank.isBlank()); // true
        System.out.println(notBlank.isBlank()); // false

        String withBlanks = "  Привет, у меня тут лишние пробелы!";
        String trimmed = withBlanks.trim();
        System.out.println(trimmed);
    }
}