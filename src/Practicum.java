/*
🦉 Этот код выводит на консоль информацию о том, сколько всего имён хранится в списке names.
Доработайте код так, чтобы он показывал еще и количество уникальных имён.

*/
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class Practicum {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        fillNames(names);
        System.out.println("Общее количество имён: " + names.size());

        HashSet<String> uniqueNumber = new HashSet<>(names);
        System.out.println("Количество уникальных имён: " + uniqueNumber.size());
    }

    private static void fillNames(List<String> names) {
        names.add("Максим");
        names.add("Светлана");
        names.add("Иван");
        names.add("Ольга");
        names.add("Максим");
        names.add("Пётр");
        names.add("Олег");
        names.add("Иван");
        names.add("Ольга");
        names.add("Ирина");
    }
}