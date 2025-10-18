import java.util.List;

public class Calculator {

    private Calculator() {

    }

    public static double calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        double days = 0;
        for (MediaItem mediaItem : mediaItems) {
            days = days + (double) mediaItem.getRuntime() / 1440;
        }
        return days;
    }
}