/*

*/
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> statescapitals = new HashMap<>();
        statescapitals.put("Россия", "Москва");
        statescapitals.put("Франция", "Париж");
        statescapitals.put("Италия", "Рим");

        System.out.println(statescapitals.containsKey("Италия")); // отобразит  true
        System.out.println(statescapitals.containsKey("Германия"));  // отобразит  false

        System.out.println(statescapitals.containsValue("Париж")); // отобразит  true
        System.out.println(statescapitals.containsValue("Пекин")); // отобразит  false
    }
}