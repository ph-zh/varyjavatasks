/*

*/

import java.util.ArrayList;
import java.util.Collection;

public class Practicum {

    public static void main(String[] args) {
        final Collection<String> colors = new ArrayList<>();
        colors.add("Жёлтый");
        colors.add("Красный");

        final Collection<String> colorsAdditional = new ArrayList<>();
        colorsAdditional.add("Зелёный");
        colorsAdditional.add("Жёлтый");

        colors.addAll(colorsAdditional);
        System.out.println(colors);

        final Collection<String> greenAndRed = new ArrayList<>();
        greenAndRed.add("Зелёный");
        greenAndRed.add("Красный");
        System.out.println("Список содержит Зелёный и Красный: " + colors.containsAll(greenAndRed));

        final Collection<String> yellowOnly = new ArrayList<>();
        yellowOnly.add("Жёлтый");
        colors.removeAll(yellowOnly);

        System.out.println(colors);
    }
}