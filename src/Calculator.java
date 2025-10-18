import java.util.List;

public class Calculator {

    private Calculator() {

    }

    public static double calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        double days = 0;
        for (MediaItem mediaItem : mediaItems) {
            if(mediaItem instanceof Movie) {
                days = days + (double) mediaItem.getRuntime();
            } else if (mediaItem instanceof Series) {
                days = days + (double) mediaItem.getRuntime() * mediaItem.getSeriesCount();
            }
        }
        return days / 1440;
    }
}