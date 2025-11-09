/*
В лаборатории высокотехнологичного агрохолдинга разработали уникальную методику селекции картошки.
Каждой картофелине из нового урожая присваивается её уникальный идентификатор, а также измеряются основные характеристики — масса, длина и ширина.
Затем для каждой картофелины вычисляется альфа-характеристика, равная 50% от массы, 65% от длины и 80% от ширины.
После этого, выбираются две картошки с самым большим показателям альфа-характеристик и две с самым маленьким. Именно они отправляются на главное испытание, по которому производится вывод, поступит ли этот сорт картошки в продажу или нет.
Вам необходимо реализовать для класса картошки Potato интерфейс Comparable<Potato>, который сравнит две картофелины по их альфа-характеристикам.
После этого допишите метод **findPotatoesForExperiment класса PotatoLaboratory, чтобы он находил две самые большие и две самые маленькие по альфа-характеристикам картошки. Результат выведите в порядке от меньшего к большему.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PotatoLaboratory {

    public static void main(String[] args) {
        List<Potato> potatoes = List.of(
                new Potato(1, 30, 30, 30),
                new Potato(2, 35, 31, 35),
                new Potato(3, 40, 35, 44),
                new Potato(4, 28, 44, 41),
                new Potato(5, 33, 23, 30),
                new Potato(6, 35, 33, 33),
                new Potato(7, 38, 41, 24)
        );

        List<Potato> fourUnderExperiment = findPotatoesForExperiment(potatoes);

        System.out.println("Картофелины для эксперимента: " + fourUnderExperiment);
    }

    private static List<Potato> findPotatoesForExperiment(List<Potato> potatoes) {
				/* Вычислите две самые большие и две самые маленькие картофелины,
           а затем выведите их в порядке от самых маленьких до самых больших.*/
        final ArrayList<Potato> mutableList = new ArrayList<>(potatoes);
        mutableList.get(0);

        Collections.sort(mutableList);
        System.out.println(mutableList);
        System.out.println(mutableList.get(0));
        System.out.println(mutableList.get(1));

        return null;
    }
}