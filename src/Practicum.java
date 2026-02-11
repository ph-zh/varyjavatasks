/*
🦉 Даже такая простая операция, как добавление нового элемента в хеш-таблицу может сгенерировать исключение.
Чтобы было понятно, что пошло не так — добавьте обработку конкретных исключений.
- Для NullPointerException выведите текст — «Реализация не поддерживает неинициализированные объекты.».
- Для UnsupportedOperationException — сообщение «Реализация не поддерживает добавление новых объектов.».
*/
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Practicum {
    public static void main(String[] args) {
        System.out.println(addToMap(new HashMap<>(), "test", "test"));
        System.out.println(addToMap(new HashMap<>(), null, null));

        System.out.println(addToMap(new TreeMap<>(), "test", "test"));
        System.out.println(addToMap(new TreeMap<>(), null, null));

        System.out.println(addToMap(Map.of(), "test", "test"));
    }

    public static Map<String, Object> addToMap(final Map<String, Object> storage,
                                               final String key, final Object value) {
        storage.put(key, value);
        return storage;
    }
}