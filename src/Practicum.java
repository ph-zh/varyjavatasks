/*

 */
class Book {
    public String title;
    public String author;
    public int pagesNumber;

    public Book(String title, String author, int pagesNumber) {
        this.title = title;
        this.author = author;
        this.pagesNumber = pagesNumber;
    }
}

public class Practicum {
    public static void main(String[] args) {
        // сохраняем одно и то же число в две переменные
        int variable1 = 42;
        int variable2 = 42;

        boolean result = variable1 == variable2; // сравниваем значения переменных
        System.out.println(result); // значения равны

        String title = "Java практикум для начинающих";
        String author = "Иван Сеньёров";
        int pagesNumber = 777;

        // передаём одни и те же данные двум объектам
        Book book1 = new Book(title, author, pagesNumber);
        Book book2 = new Book(title, author, pagesNumber);

        boolean result2 = book1 == book2; // сравниваем значения объектных переменных
        System.out.println(result2); // получили некорректный результат
    }
}