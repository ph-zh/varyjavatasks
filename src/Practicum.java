/*

*/
class IntegerConverter {
    public static int convert(final String input) {
        try {
            return Integer.parseInt(input, 10); // если исключения нет - вернётся число
        } catch (Throwable exception) {
            return 0; // если поймано исключение - вернётся 0
        }
    }
}

public class Practicum {
    public static void main(String[] args) {
        System.out.println(IntegerConverter.convert("10"));
        System.out.println(IntegerConverter.convert("abc10"));
        System.out.println(IntegerConverter.convert("00111"));
    }
}