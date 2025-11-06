/*

*/

import java.util.ArrayList;
import java.util.Collections;

public class PracticumA {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Банан");
        fruits.add("Апельсин");
        fruits.add("Яблоко");
        fruits.add("Груша");

        System.out.println(fruits);

        Collections.sort(fruits, String.CASE_INSENSITIVE_ORDER);

        System.out.println(fruits);
    }
}