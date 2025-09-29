/*
Перед вами кусок кода компьютерной игры про Средневековье. В ней есть много разных локаций,
в том числе — смешанные леса с хвойными и лиственными деревьями.
Вам нужно создать симулятор такого леса, поселить в нём зайцев-беляков.
Обратите внимание, что цвет шерсти у всех зайцев  color меняется в зависимости от
времени года season: зимой — белый, летом — серо-рыжий.
 */
import java.util.List;

public class Practicum {

    public static void main(String[] args) {
        List<MountainHare> hares = List.of(
                new MountainHare(4, 4.4, 120),
                new MountainHare(7, 3.6, 150),
                new MountainHare(1, 2.3, 100)
        );

        System.out.println("В лесу лето!");
        // создайте объект "летний лес с зайцами"

        System.out.println("Список зайцев:");
        forest.printHares();

        System.out.println("В лесу зима!");
        // поменяйте время года на зиму

        System.out.println("Список зайцев:");
        forest.printHares();
    }

}