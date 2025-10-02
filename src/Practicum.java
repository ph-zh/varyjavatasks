/*

 */
import java.util.ArrayList;
import java.util.List;

public class Practicum {

    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film("Зелёная миля", FilmGenre.DRAMA));
        films.add(new Film("Побег из Шоушенка", FilmGenre.DRAMA));
        films.add(new Film("Властелин колец: Братство Кольца", FilmGenre.FANTASY));
        films.add(new Film("Король Лев", FilmGenre.FAMILY));

        filterByGenre(films, FilmGenre.FANTASY);
    }

    // Метод для фильтрации списка фильмов по жанру:
    public static void filterByGenre(List<Film> films, FilmGenre genre) {
        for (Film film : films) {
            // Сравнение жанра фильма из списка с искомым жанром:
            if (film.getGenre() == genre) {
                System.out.println(film.getTitle());
            }
        }
    }
}

class Film {
    private String title;
    private FilmGenre genre;

    public Film(String title, FilmGenre genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public FilmGenre getGenre() {
        return genre;
    }
}