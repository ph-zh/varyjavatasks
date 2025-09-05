/*
Исправьте метод playHamlet() так, чтобы исполнитель performer прочитал строчку из
монолога Гамлета — «Быть иль не быть? Вот в чём вопрос?».
 */

class Actor {

    void play() {
        System.out.println("Гул затих. Я вышел на подмостки.");
    }
}

class Hamlet extends Actor {
    @Override
    void play() {
        System.out.println("Быть или не быть? Вот в чём вопрос?");
    }
}

public class Main {
    public static void main(String[] args) {
        Hamlet performer = new Hamlet();
        performer.play();
    }
}