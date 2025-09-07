class Teacher {
    int numberOfLessons; // число уроков
    int numberOfPupils; // число учеников
    String name; // имя учителя

    // конструктор класса-родителя
    public Teacher(int newNumberOfLessons,
                   int newNumberOfPupils,
                   String newName) {
        numberOfLessons = newNumberOfLessons;
        numberOfPupils = newNumberOfPupils;
        name = newName;
    }
}

class GymTeacher extends Teacher {
    int basketballLessons; // уроки по баскетболу
    int swimmingLessons; // уроки по плаванию
    int freeLessons; // уроки без строгой программы

    // конструктор в подклассе принимает и свои параметры, и параметры суперкласса
    public GymTeacher(int newNumberOfLessons,
                      int newNumberOfPupils,
                      String newName,
                      int numberBasketballLessons,
                      int numberSwimmingLessons) {
        // сначала вызываем конструктор класса-родителя
        super(newNumberOfLessons, newNumberOfPupils, newName);
        // инициализируем новые поля
        basketballLessons = numberBasketballLessons;
        swimmingLessons = numberSwimmingLessons;
        // поле freeLessons вычисляется на основе заданных параметров
        freeLessons = newNumberOfLessons - numberBasketballLessons - numberSwimmingLessons;
    }

    public void printInfo() {
        System.out.println("ФИО учителя - " + name);
        System.out.println("Число учеников - " + numberOfPupils);
        System.out.println("Число уроков - " + numberOfLessons);
        System.out.println("Уроков по плаванию - " + swimmingLessons);
        System.out.println("Уроков по баскетболу - " + basketballLessons);
        System.out.println("Свободных уроков - " + freeLessons);
    }
}

public class Practicum {
    public static void main(String[] args) {
        GymTeacher teacher = new GymTeacher(12, 30, "Олег Евгеньевич Фомин", 5, 4);
        teacher.printInfo();
    }
}