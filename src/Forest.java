import java.util.List;

public class Forest {
    // объявите недостающие переменные и добавьте конструктор
    private List<MountainHare> hares;
    static String season;

    public Forest(List<MountainHare> newHares, String newSeason) {
        hares = newHares;
        season = newSeason;
    }

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков
    public static void setSeason(String newSeason) {
        if (newSeason.equals("летний лес с зайцами")) {
            System.out.println("серо-рыжий");

        }
        if (newSeason.equals("зимний лес с зайцами")) {
            System.out.println("белый");
        }
    }

    // добавьте метод printHares()
    public void printHares() {
        System.out.println(hares.toString());
    }


}