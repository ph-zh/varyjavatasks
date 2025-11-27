/*
Реализуйте методы capsLock() и print(). Первый устанавливает флаг isCapsLock в true или false.
Второй выводит строку в верхнем или оставляет регистр как есть в зависимости от этого флага.
capsLock() — включает или выключает режим Caps Lock, устанавливая флаг isCapsLock.
print(String str) — выводит сообщение в верхнем регистре, если isCapsLock == true, иначе выводит без изменений.
*/
public class TextEditor {

    private boolean isCapsLock = false;

    public void capsLock() {
        // Здесь нужно изменить значение флага isCapsLock на противоположное
        if (!isCapsLock) {
            isCapsLock = true;
        } else {
            isCapsLock = false;
        }
    }

    public void print(String str) {
        // а здесь нужно распечатать строку или в верхнем регистре, или без изменений, учитывая флаг

        if (isCapsLock) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str);
        }
    }
}