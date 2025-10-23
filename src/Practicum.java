/*

 */

import java.util.ArrayList;
import java.util.List;

public class Practicum {
    public static void main(String[] args) {
        Bag<Apple> bag = new Bag<>();
        bag.addFruit(new Apple());
        bag.printPurchase();
    }
}
class Apple extends Fruit {

    public Apple() {
        super("Яблоко", 10.0);
    }

}

class Bag<T extends Fruit> {
    private final List<T> purchase = new ArrayList<>();

    public void addFruit(T fruit) {
        purchase.add(fruit);
    }

    public void printPurchase() {
        if (!purchase.isEmpty()) {
            double sum = 0;
            for (T fruit : purchase) {
                sum += fruit.getPrice();
            }
            System.out.println("Ваша покупка: пакетик с фруктами - " + purchase.get(0).getName());
            System.out.printf("Стоимость вашей покупки составит %f рублей", sum);
        }
    }
}
class Banana extends Fruit {

    public Banana() {
        super("Банан", 15.50);
    }

}
abstract class Fruit {
    private final String name;
    private final Double price;

    protected Fruit(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}