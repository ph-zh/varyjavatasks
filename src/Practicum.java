/*

 */

public class Practicum {

    public static void main(String[] args) {
        System.out.println(getDownloadLink(DeviceType.RED));
    }

    public static String getDownloadLink(DeviceType type) {
        String link = null;

        switch (type) {
            case ANDROID:
                link = "https://play.google.com/store/apps/раздельный_сбор_мусора";
                break;
            case IOS:
                link = "https://apps.apple.com/ru/app/раздельный_сбор_мусора";
                break;
            case WEB:
                link = "https://сайт_про_раздельный_сбор_мусора.ru";
                break;
        }

        return link;
    }
}

enum DeviceType {
    ANDROID,
    IOS,
    WEB,
    RED
}