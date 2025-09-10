/*
Чтобы выполнить этот квиз, скопируйте код ниже в среду разработки IDEA.
Добавьте в него всё что нужно, чтобы программа заработала. Используйте комбинацию alt+Insert или команду Generate....
У вас также есть уникальная возможность научить лису говорить так, как считаете нужным.
 */

class Animal {
    private double weight;
    private int age;

    public Animal() {
        this.weight = 0.0d;
        this.age = 0;
    }

    public String say() {
        return "Мяу, гав, хрю, кря!";
    }
}

class Fox extends Animal {
    private String color;

    public Fox(Animal animal, String color) {
        
        this.color = color;
    }

    // научите лису говорить
    @Override
    public String say() {
        return super.say();
    }

}

public class Practicum {
    public static void main(String[] args) {
        Fox fox = new Fox("рыжий");
        fox.setWeight(5.93d);
        fox.setAge(5);
        System.out.println("Вес лисы - " + fox.getWeight());
        System.out.println("Возраст лисы - " + fox.getAge());
        System.out.println("Цвет лисы - " + fox.getColor());
        System.out.println("Лиса говорит - " + fox.say());
    }
}