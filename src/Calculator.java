import java.util.List;

public class Calculator {

    private Calculator() {

    }

    public static double calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        double minutes = 0;
        for (MediaItem mediaItem : mediaItems) {
            if(mediaItem instanceof Movie) {
                minutes += mediaItem.getRuntime();
            } else if (mediaItem instanceof Series) {
                minutes += mediaItem.getRuntime() * mediaItem.getSeriesCount();
            }
        }
        return minutes / 1440;
    }
}