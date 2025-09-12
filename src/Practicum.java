/*

 */

public class Practicum {
    public static void main(String[] args) {
        Person[] people = { new Person("Пелагея"), new Person("Ферапонт") };
        int peopleCount = sizeOf(people);
        System.out.println("В массиве people " + peopleCount + " элемента.");

        String[] names = { "Федот", "Глафира", "Аграфена",  "Епифаний"};
        int namesCount = sizeOf(names);
        System.out.println("В массиве names " + namesCount + " элемента.");

        Integer[] numbers = { 42, 24, 45, 34, 23, 43, 54, 65, 43 };
        int numbersCount = sizeOf(numbers);
        System.out.println("В массиве numbers " + numbersCount + " элемента.");
    }

    public static int sizeOf(Object[] array) { // параметр - массив элементов типа Object)
        int count = 0;
        for (Object o : array) {
            count++;
        }
        return count;
    }
}

class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }
}