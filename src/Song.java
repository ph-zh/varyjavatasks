import java.util.Objects;

public class Song {
    public final String title;
    public final String artist;
    public final String songwriter;

    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }

    // переопределите метод equals(Object)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // проверяем адреса объектов
        if (obj == null) return false; // проверяем ссылку на null
        if (this.getClass() != obj.getClass()) return false; // сравниваем классы объектов
        Song otherSong = (Song) obj; // привели второй объект к классу Song
        return Objects.equals(title, otherSong.title) &&
               Objects.equals(artist, otherSong.artist) &&
               Objects.equals(songwriter, otherSong.songwriter);
    }
}