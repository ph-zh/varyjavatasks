/*

*/

import java.util.ArrayList;

public class Practicum {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Банан");
        fruits.add("Апельсин");
        fruits.add("Яблоко");
        fruits.add("Груша");

        System.out.println(fruits); // [Банан, Апельсин, Яблоко, Груша]

        // Вызовите компаратор String.CASE_INSENSITIVE_ORDER
        fruits.sort(String.CASE_INSENSITIVE_ORDER);

        System.out.println(fruits); // [Апельсин, Банан, Груша, Яблоко]
    }
}