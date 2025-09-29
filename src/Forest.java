import java.util.List;

public class Forest {
    private List<MountainHare> hares;
    static String season;

    public Forest(List<MountainHare> hares, String newSeason) {
        this.hares = hares;
        season = newSeason;
    }
    // объявите недостающие переменные и добавьте конструктор


    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков
    void setSeason(String newSeason) {
        if (newSeason.equals("летний лес с зайцами")) {
            System.out.println("серо-рыжий");
        }
        if (newSeason.equals("зимний лес с зайцами")) {
            System.out.println("белый");
        }
    }

    // добавьте метод printHares()
    void printHares() {
        System.out.println(hares.toString());
    }

}