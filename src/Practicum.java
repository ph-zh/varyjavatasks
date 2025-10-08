/*
🦉 В интерфейс NoteBook был добавлен метод для удаления заметок — deleteNote(int index). Запустите программу и изучите текст ошибки.
Исправьте код: реализуйте метод deleteNote(int index) и раскомментируйте вызов этого метода.
Если в метод был передан некорректный индекс, выведите сообщение об ошибке: «Неверный индекс для удаления заметки».
Если же индекс верный, удалите ненужную заметку и выведите пользователю сообщение: «Заметка успешно удалена!».
 */

import java.util.ArrayList;
import java.util.List;

interface NoteBook {
    void addNote(String note);

    void deleteNote(int index);
}

class CalendarApp implements NoteBook {
    List<String> notes = new ArrayList<>();

    @Override
    public void addNote(String note) {
        notes.add(note);
        System.out.println("Заметка успешно добавлена!");
    }

    @Override
    public void deleteNote(int index) {
        if (index < 0 || index >= notes.size()) {
            System.out.println("Неверный индекс для удаления заметки");
        } else {
            notes.remove(index);
            System.out.println("Заметка успешно удалена!");
        }
    }
}

public class Practicum {

    public static void main(String[] args) {
        CalendarApp noteBook = new CalendarApp();
        noteBook.addNote("Зайти в магазин после работы.");
        noteBook.addNote("Позвонить маме.");

        noteBook.deleteNote(0);
    }
}