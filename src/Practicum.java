/*
Маленькие дети часто забывают, что нужно начинать новое предложение с большой буквы.
Помогите им! Реализуйте метод capitalize(). Он должен переводить первый символ в переданной строке в
верхний регистр при помощи метода toUpperCase() и возвращать полученную строку.
*/
public class Practicum {
    public static void main(String[] args) {
        Capitalizator check = new Capitalizator();
        System.out.println(check.capitalize("я не волшебник, я только учусь!"));
    }
}