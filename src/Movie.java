import java.util.Objects; // импортируем класс Objects

public class Movie {
    String title; // название фильма
    int releaseYear; // год выхода на экраны

    public String description() { // метод для вывода описания фильма
        return '"' + title + "\" (" + releaseYear + " год)";
    }

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // проверяем адреса объектов
        if (obj == null) return false; // проверяем ссылку на null
        if (this.getClass() != obj.getClass()) return false; // сравниваем классы объектов
        Movie anotherMovie = (Movie) obj; // привели второй объект к классу Movie
        return Objects.equals(title, anotherMovie.title) && // проверяем поля
               (releaseYear == anotherMovie.releaseYear); // примитивы сравниваем через ==
    }

    @Override
    public int hashCode() {
        // вызываем вспомогательный метод и передаём в него нужные поля
        int hash = 17;
        if (title != null) {
            hash = hash + title.hashCode();
        }
        hash = hash * 31;

        return hash;
    }
}