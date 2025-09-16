/*

 */

import java.util.Objects;

class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (firstName != null) {
            // вычисляем хеш первого поля и добавляем к нему начальное значение
            hash = hash + firstName.hashCode();
        }
        hash = hash * 31; // умножаем промежуточный результат на простое число

        if (lastName != null) {
            // вычисляем хеш второго поля и добавляем его к общему результату
            hash = hash + lastName.hashCode();
        }
        return hash; // возвращаем итоговый хеш
    }
}

public class Practicum {
    public static void main(String[] args) {
        // Создаём два разных объекта Person
        Person person1 = new Person("Лю", "Чен");
        Person person2 = new Person("Чен", "Лю");

        // Проверяем, что объекты не равны и у них разные хеш-коды
        System.out.println("person1.hashCode() = " + person1.hashCode() +
                "\nperson2.hashCode() = " + person2.hashCode());

    }
}