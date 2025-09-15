public class Movie {
    String title; // название фильма
    int releaseYear; // год выхода на экраны

    public String description() { // метод для вывода описания фильма
        return '"' + title + "\" (" + releaseYear + " год)";
    }
}