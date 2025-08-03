/*
Вам необходимо доработать игру — гонки. Игрок-пользователь соревнуется с противником, сгенерированным компьютером. Победитель определяется по сравнению характеристик. Действуйте по пунктам:
 1/ Внимательно прочитайте код. Разберитесь, как он устроен.
 2/ Допечатайте все нужные характеристики — для этого нужно обратиться к полям класса.
 3/ Реализуйте методы:
 4/ Параметры авто игрока будут подгружаться из отдельного сервиса, хранение данных в котором отличается от используемого в игре.
 Метод createCarByProperties(CarProperties carProperties), должен конвертировать параметры в нужные типы и возвращает экземпляр класса Car.
 5/ Метод Integer getNitroLevel(int nitroLevel) должен возвращать значение nitroLevel. Если nitroLevel равен нулю — тогда нужно вернуть null.
 6/ Метод makeRace(Car userCar, Car opponentCar, int distance) должен определять победителя и возвращать количество полученных или проигранных очков:
 - Если гоночная дистанция — переменная distance — меньше или равна 15 километрам, то победителем объявляется тот игрок,
 у автомобиля которого больше ускорение — поле acceleration. Если дистанция больше 50 километров, то выигрывает тот, у автомобиля которого наибольшая максимальная скорость — поле maxSpeed.
 - В случае победы игрока метод возвращает количество очков, равное наибольшему из максимальных скоростей участников.
 - Если по первому условию определить победителя не удалось, сравниваются ускорения игроков. Если они равны, объявляется ничья и метод возвращает 0 очков.
 - Если и ничью определить не удалось, сравнивается уровень закиси азота. Если он строго больше, то метод возвращает 0 очков. Если нет, метод возвращает -100 очков.
 7/ Метод changePointAndDistance(...) должен менять количество очков на переданный аргумент points и увеличивать количество пройденных километров на аргумент distance.
*/
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarProperties userCarProperties =
                new CarProperties(
                        "100",
                        0.7f,
                        2
                );

        Car userCar = createCarByProperties(userCarProperties);
        System.out.println("Давно тебя не было в Яндекс.Гонках!");
        System.out.println("Характеристики твоего автомобиля:");
        // Напечатайте характеристики автомобиля игрока
        System.out.println("- Максимальная скорость: " + ...);
        System.out.println("- Ускорение: " + ...);
        System.out.println("- Закись азота: " + ...);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Что выберете?");
            System.out.println("1 - Устроить заезд");
            System.out.println("2 - Показать статистику");
            System.out.println("3 - Закончить игру");
            int command = scanner.nextInt();

            if (command == 1) {
                Car opponentCar = generateOpponentCar();
                System.out.println("Характеристики автомобиля соперника:");
                // Напечатайте характеристики автомобиля соперника
                System.out.println("- Максимальная скорость: " + ...);
                System.out.println("- Ускорение: " + ...);
                System.out.println("- Закись азота: " + ...);

                int distance = generateInt(5, 70);
                System.out.println("Гонка будет проходить на дистанции: " + distance + " км.");

                int points = makeRace(userCar, opponentCar, distance);
                changePointAndDistance(...); // передайте в метод аргументы

            } else if (command == 2) {
                // Напечатайте количество заработанных очков и пройденных километров
                System.out.println("- Количество заработанных очков: " + ...);
                System.out.println("- Пройдено километров на этом авто: " + ...);
            } else if (command == 3) {
                System.out.println("Увидимся!");
                break;
            }
        }
    }

    private static void changePointAndDistance(...) { // реализуйте метод
        // В результате выполнения метода у userCar количество очков должно увеличиться
        // на значение points, пройденное расстояние - на значение distance.
        ...
    }

    private static int makeRace(Car userCar, Car opponentCar, int distance) {
        printFlag();
        // Напишите логические выражения для определения победителя
        boolean shortRaceWin = ... // на короткой дистанции
        boolean longRaceWin = ... // на длинной дистанции

        if (...) { // если победил на короткой или на длинной дистанции
            System.out.println("Вы выиграли!");
            // Найдите и верните наибольшее из максимальных скоростей
            ...
            return ...;
        } else if (...) { // Уровни ускорения должны быть равны
            System.out.println("Ничья!");
            return ...
        } else {
            // Сравните уровни закиси азота
            if (...) {
                System.out.println("Вы проиграли, но благодаря закиси азота сохранили очки.");
                return ...;
            } else {
                System.out.println("Вы проиграли(");
                return ...;
            }
        }
    }
    private static void printFlag() { // Метод печатает флаг
        System.out.println("_\n" +
                "\\'-,,.\n" +
                " \\    \\\n" +
                "  \\-..,\\\n" +
                "   \\\n" +
                "    \\\n");
    }
    // Метод генерирует авто противника
    private static Car generateOpponentCar() {
        // С помощью метода generateInt() генерируем число от 75 до 125
        double maxSpeed = generateInt(75, 125);
        // Чтобы создать число от 0.4 до 1, с помощью метода generateInt() генерируем число от 4 до 10,
        // после чего делим его на 10
        float acceleration = generateInt(4, 10) / 10.0f;
        int score = 0;
        // С помощью метода generateInt() генерируем число от 1 до 5
        Integer nitroLevel = generateInt(1, 5);

        return new Car(
                maxSpeed,
                acceleration,
                score,
                nitroLevel
        );
    }

    // Этот метод создаёт случайное число в промежутке от from до to
    private static int generateInt(int from, int to) {
        int diapason = to - from;
        int offence = new Random().nextInt(diapason);
        return from + offence;
    }

    private static Car createCarByProperties(CarProperties carProperties) {
        // Конвертируйте параметры в нужные типы
        double maxSpeed = ...;
        float acceleration = ...;
        int score = ...;
        Integer nitroLevel = ...;

        return new Car( // Метод возвращает экземпляр класса Car
                maxSpeed,
                acceleration,
                score,
                nitroLevel
        );
    }

    private static Integer getNitroLevel(int nitroLevel) {
        // Пропишите логику по конвертации параметра nitroLevel
        ...
    }
}