/*
Напишите программу для бронирования комнаты с завтраком в мини-отеле “Royal Java Bed and Breakfast”.
В нём 10 номеров. Реализуйте методы для заселения book() и выезда free() гостей.
Расставьте нужные модификаторы доступа: переменные capacity (вместимость) и full (заполненность),
а также метод printRooms() нужно скрыть — доступ к ним должен остаться только внутри класса BedAndBreakfast.
Сам класс BedAndBreakfast и другие методы в нём должны иметь максимальный уровень доступа.
Не забудьте, что когда вы закроете переменные, к ним нельзя будет обратиться — нужно будет обращаться к методам.
 */
package ru.yandex.practicum.model;

public class BedAndBreakfast { // сделайте класс общедоступным

    private int capacity = 10;// число свободных номеров (10) сохраните в переменную capacity
    private boolean full = false;// сохраните в переменную full значение false - есть номера в наличии

    public void book() { // метод для бронирования комнат
        if (!full) { // если есть свободные номера
            System.out.println("Забронирован ещё один номер!");
            capacity -= 1; // уменьшите количество свободных номеров на один
            printRooms();
            if (capacity == 0) {
                full = true;
            }
        } else {
            System.out.println("Свободных номеров нет!");
        }
    }

    private void printRooms() {
        System.out.println("Свободных номеров - " + capacity);
    }

    public void free() { // метод для освобождения комнат
        if (capacity < 10) { // если свободных комнат меньше 10
            capacity += 1; // увеличиваем количество свободных мест на одно
            System.out.println("Освободился номер!");
            printRooms();
            full = false;
        } else {
            System.out.println("В гостинице только 10 номеров.");
        }
    }

    public boolean isFull() {
        return full;
    }
}