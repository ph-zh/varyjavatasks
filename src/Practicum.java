/*

*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practicum {
    public static void main(String[] args) {
        List<String> allNames = new ArrayList<>();
        allNames.add("Марья");
        allNames.add("Пётр");
        allNames.add("Светлана");
        allNames.add("Кристина");
        allNames.add("Иван");
        allNames.add("Макс");
        allNames.add("Светлана");
        allNames.add("Иван");

        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.addAll(allNames);

        System.out.println("Количество имён в списке allNames: " + allNames.size());
        System.out.println("Количество имён в множестве uniqueNames: " + uniqueNames.size());
    }
}