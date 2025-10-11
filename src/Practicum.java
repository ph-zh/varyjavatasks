/*
🦉 Дан интерфейс Openable, описывающий предметы, которые можно открыть, и два класса: Can и Window. Доработайте классы таким образом, чтобы они реализовывали интерфейс Openable.
 */

public class Practicum {
    public static void main(String[] args) {
        Openable can = new Can();
        can.open();

        Openable window = new Window();
        window.open();
    }
}

interface Openable {
    void open();
}

class Can implements Openable {
    @Override
    public void open() {
        System.out.println("Чтобы открыть жестяную банку, нужно потянуть кольцо-ключ.");
    }
}

class Window implements Openable {
    @Override
    public void open() {
        System.out.println("Чтобы открыть окно, нужно повернуть ручку.");
    }
}