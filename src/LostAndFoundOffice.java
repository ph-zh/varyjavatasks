/*
Допишите код класса — бюро находок LostAndFoundOffice. В нём должен быть список things для учёта потерянных вещей, метод put() для добавления вещи в список, метод check() — для проверки её наличия.
В зависимости от результата check() должен возвращать true или false. Методы put() и check() должны быть универсальными — принимать в качестве параметра объекты любых классов.
Не забудьте предусмотреть ситуацию, если в check() передана пустая ссылка.
 */

import java.util.ArrayList;

public class LostAndFoundOffice {
    // создайте список things
    static ArrayList<Object> things = new ArrayList<>();

    // реализуйте метод put()
    public static void put(Object object) {
        things.add(object);
    }

    // реализуйте метод check()
    public static boolean check(Object target) {
        for (Object object : things) { // логика проверки вещи в списке
            if (object.equals(target)) {
                return true;
            }
        }
        return false;
    }
}