/*
Класс IntegerParser преобразует строку в целое число. Строку на вход передают пользователи,
а это всегда риск некорректного ввода данных. Исключения будут генерироваться в методе parseInt().
Важно обработать все исключения так, чтобы в случае, если они произойдут, пользователи увидели сообщения,
с помощью которых могут исправить допущенную ошибку ввода.
Для каждого типа исключений должен быть настроен свой вывод.
1/ NullStringException и EmptyStringException — "Введена пустая строка."
2/ StringNotNumberException — "Вы ввели не целое число."
3/ StringIsTooBigNumberException — "Введённое число слишком большое."
4/ StringIsTooSmallNumberException — "Введённое число слишком маленькое."

Р. S. Часть кода, необходимого для запуска программы, специально скрыта от вас, чтобы не отвлекать от выполнения задания.
*/
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        System.out.print("Введите целое число => ");
        Scanner scanner = new Scanner(System.in);
        final String inputValue = scanner.next();
        final int parsedValue = IntegerParser.parseInt(inputValue);
        System.out.println(parsedValue);
    }
}