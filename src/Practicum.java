/*

 */

public class Practicum {

    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("Привет! Я - зелёная лягушка.");
        frog.move();
        frog.eat();

        Toad toad = new Toad();
        System.out.println("Привет! Я - коричневая жаба.");
        toad.move();
        toad.eat();
    }

}
abstract class Amphibian {

    public abstract void move();

    public void eat() {
        System.out.println("Кушаю насекомых");
    }

}
class Frog extends Amphibian {

    @Override
    public void move() {
        System.out.println("Я передвигаюсь по суше прыжками.");
    }

}
class Toad extends Amphibian {

    @Override
    public void move() {
        System.out.println("Я важно хожу.");
    }

}