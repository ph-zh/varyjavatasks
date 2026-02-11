/*
🦉 Добавьте обработку исключений при преобразовании строки в URL в метод parseStringToURI(). При ошибке возвращайте значение null.
*/
import java.net.URI;

public class Practicum {
    public static void main(String[] args) {
        System.out.println(parseStringToURI("https://ya.ru"));
        System.out.println(parseStringToURI("\\\\"));
        System.out.println(parseStringToURI(null));
    }

    public static URI parseStringToURI(final String input) {
        try {
            return new URI(input);
        } catch (Throwable exception) {
            return null;
        }
    }
}