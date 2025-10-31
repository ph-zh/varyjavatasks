/*

*/

import java.util.ArrayList;
import java.util.List;

public class Practicum {

    public static void main(String[] args) {

        List<Long> list = new ArrayList<>(); // создание списка

        // добавление элементов в конец:
        list.add(0L);
        list.add(1L);
        list.add(2L);
        System.out.println(list);  // список выглядит так - [0, 1, 2]

        // добавление элемента по индексу
        list.add(2, 22L);  // 2L сдвигается вправо, и на его месте появится 22L
        System.out.println(list); // список стал таким - [0, 1, 22, 2]

        // вставка элемента в конец списка
        list.add(4, 4L);
        System.out.println(list); // обновлённый список - [0, 1, 22, 2, 4]

        // удаление элемента
        list.remove(4); // по индексу
        list.remove(2L); //  по значению
        System.out.println(list); // получился список - [0, 1, 22]

        // получение и вывод элемента по индексу
        System.out.println(list.get(2)); // напечатали 22

        // замена элемента по индексу
        list.set(2, 33L);
        System.out.println(list); // последняя версия списка - [0, 1, 33]

    }
}