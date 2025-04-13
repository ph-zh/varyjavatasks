/*
В небольшом тесте по математике было три вопроса. Напишите короткую программу,
которая выводит на экран результат проверки студента.
Ответы студента сохранены в переменных answer1, answer2 и answer3.
В первом вопросе правильный ответ — «2».
Во втором — любой, кроме «4».
В третьем — «1».
Сравните каждый из ответов студента с правильным, выводя true или false.
Например, если на первый вопрос был дан правильный ответ, нужно вывести:
Результат проверки вопроса 1:
true
 */
class Main {

    public static void main(String[] args) {
        int answer1 = 3; // Ответ на 1 вопрос
        int answer2 = 4; // Ответ на 2 вопрос
        int answer3 = 1; // Ответ на 3 вопрос

        System.out.println("Result 1: \n" + (answer1 > answer2 ? "true" : "false"));
        System.out.println("Result 2: \n" + (answer3 > answer1 ? "true" : "false"));
        System.out.println("Result 3: \n" + (answer1 > answer3 ? "true" : "false"));
    }
}