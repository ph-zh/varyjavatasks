/*
🦉 Перед вами код плеера, который показывает список прослушанных за день песен.
Некоторые из них проигрывались несколько раз.
Измените код таким образом, чтобы в консоль не выводились дубликаты одной и той же песни, если её слушали больше одного раза.
Также нужно сохранить изначальный порядок прослушивания.
*/
import java.util.LinkedHashSet;
import java.util.Set;

public class Practicum {
    public static void main(String[] args) {
        Set<String> songs = new LinkedHashSet<>();
        fillSongs(songs);

        System.out.println("Количество песен: " + songs.size());

        System.out.println("Песни:");
        for (String song : songs) {
            System.out.println("  * " + song);
        }

    }

    private static void fillSongs(Set <String> songs) {
        songs.add("Sting – Shape Of My Heart");
        songs.add("Gorillaz – Clint Eastwood");
        songs.add("Lady Gaga – Bad Romance");
        songs.add("Taylor Swift – Wildest Dreams");
        songs.add("Ariana Grande – 7 rings");
        songs.add("Depeche Mode – Personal Jesus");
        songs.add("Gorillaz – Clint Eastwood");
        songs.add("Lady Gaga – Bad Romance");
        songs.add("Bruno Mars – Talking To The Moon");
        songs.add("Taylor Swift – Wildest Dreams");
    }
}