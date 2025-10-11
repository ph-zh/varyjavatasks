/*
Запустите программу и изучите её код. Обратите внимание на полиморфный класс SoftwareDeveloper и то,
как ведут себя его объекты в зависимости от указанного типа переменной. Добавьте ввод имени с клавиатуры и попробуйте заменить имя «Катя» на своё.
 */

import java.util.Scanner;

public class Practicum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Что " + name + " делает как работник:");
        Employee employee = new SoftwareDeveloper(name);
        employee.work();
        System.out.println("Получает зарплату за месяц: " + employee.getSalary() + " р.");
        // Таких методов в интерфейсе Employee нет - произойдет ошибка
        // employee.eat();
        // employee.doDebug();

        System.out.println("\nЧто " + name + " делает как человек:");
        Person person = new SoftwareDeveloper(name);
        person.eat();
        person.sleep();
        // Таких методов в классе Person нет - произойдет ошибка
        // person.work();
        // person.doDebug();

        System.out.println("\nЧто " + name + " делает как программист:");
        SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper(name);
        softwareDeveloper.doDebug();
        softwareDeveloper.think();
    }
}
interface Employee {
    void work();

    double getSalary();
}

class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Обедает в кафе.");
    }

    public void sleep() {
        System.out.println("Крепко спит всю ночь.");
    }
}

class SoftwareDeveloper extends Person implements Employee {

    public SoftwareDeveloper(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Выполняет свою работу - пишет код весь день.");
    }

    @Override
    public double getSalary() {
        return 100500.0;
    }

    public void doDebug() {
        System.out.println("Ищет ошибки в коде.");
    }

    public void think() {
        System.out.println("Обдумывает решение задачи.");
    }
}