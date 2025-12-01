/*
Команда Ctrl/Alt + F (⌘ + F для Mac) — пожалуй, самый известный пример организации поиска
подстрок и символов внутри текста. При нажатии открывается небольшое окошко, куда вбивается текст,
и в результате вы получаете количество повторов искомого текста или символа.
Попробуйте реализовать такой подсчёт на Java. Напишите метод int numberOfRepeats(String text, String substring),
который будет возвращать число повторения подстроки substring в переданном тексте text.
Пример:

numberOfRepeats("раз два три, раз два три", "раз"); // вернёт 2
numberOfRepeats("Hello, world!", "goodbye"); // вернёт 0
*/
public class Practicum {
    public static void main(String[] args) {
        FindRepeats check = new FindRepeats();
        int count = check.numberOfRepeats("раз, раз, раз", "раз");
        System.out.println(count);
    }
}