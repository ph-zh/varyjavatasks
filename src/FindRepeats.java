/*
В уроке мы не раз сделали акцент на том, что StringBuilder позволяет не создавать лишние строки.
Проверьте это! Оптимизируйте программу по подсчету количества вхождений строки в текст из предыдущего урока,
чтобы она не создавала лишний «мусор». Подсказка: вместо contains() в StringBuilder необходимо пользоваться
методом indexOf, а вместо получения подстроки можно просто удалять лишние элементы.
*/
public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        int count = 0;
        while (text.contains(substring)) {
            count++;
            text = text.substring(text.indexOf(substring) + substring.length());
        }
        return count;
    }
}