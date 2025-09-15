/*

 */
import java.util.Objects; // импортируем класс Objects

class Book {
    public String title;
    public String author;
    public int pagesNumber;

    public Book(String title, String author, int pagesNumber) {
        this.title = title;
        this.author = author;
        this.pagesNumber = pagesNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false; // можно оформить и так
        Book otherBook = (Book) obj;
        return Objects.equals(title, otherBook.title) &&
                Objects.equals(author, otherBook.author) &&
                (pagesNumber == otherBook.pagesNumber);
    }
}

public class Practicum {
    public static void main(String[] args) {
        String title = "Java-практикум для начинающих";
        String author = "Иван Сеньёров";
        int pagesNumber = 777;

        Book book1 = new Book(title, author, pagesNumber);
        Book book2 = new Book(title, author, pagesNumber);

        System.out.println("Сравниваем книги, результат - " + book1.equals(book2));
    }
}