/*
Кот Пиксель очень любит играть с мячиками — всего их у него 15. Днём он повсюду их прячет (число спрятанных мячиков считывается из консоли),
но вечером всегда возвращает на место. Расставьте переменные balls и hiddenBalls в коде так,
чтобы программа смогла правильно посчитать количество мячиков у Пикселя до начала игры, во время неё и в конце дня.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Сохраните общее число мячиков Пикселя в переменной balls
        int balls = 15;
        System.out.println("У Пикселя " + balls + " мячиков");

		// Поиграйте с Пикселем, вызвав метод playPixel
        playPixel(balls);

        // После игры Пиксель должен вернуть все мячики на место!
        System.out.println("Пиксель вернул все мячики");
        System.out.println("Их снова " + balls);
    }

    public static void playPixel(int balls) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько мячиков он спрятал?");
        int hiddenBalls = scanner.nextInt(); // Сохраните количество мячиков, которые спрятал Пиксель, в переменную hiddenBalls

        balls = balls - hiddenBalls; // Посчитайте, сколько у Пикселя осталось мячиков
        System.out.println("Осталось " + balls );
    }
}