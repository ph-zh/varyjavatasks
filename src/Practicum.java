/*

 */
import java.util.HashMap;
import java.util.Map;

public class Practicum {

    public static void main(String[] args) {
        Map<String, Double> catsWithWeight = new HashMap<>();
        catsWithWeight.put("Пиксель", 4.6);
        catsWithWeight.put("Космонавт", 5.0);
        catsWithWeight.put("Потата", 3.2);
        catsWithWeight.put("Байтик", 2.4);

        for (String cat : catsWithWeight.keySet()) {
            System.out.printf("Котик %s весит %f\n",cat, catsWithWeight.get(cat));
        }
    }

}
