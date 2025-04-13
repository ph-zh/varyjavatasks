/*
Давайте ещё немного прокачаем приложение. Сделаем так, чтобы оно могло конвертировать не только в
доллары, но и в евро. В переменной currency сохраните название валюты: USD или EUR.
В зависимости от того, какая валюта хранится в переменной, пользователь увидит сумму своих
сбережений в долларах или евро.
 */
class Main {
    public static void main(String[] args) {
        double rateUSD = 78.5;
        double rateEUR = 85.5;
        double rubles = 14560.5;

        String currency = "USD";
        System.out.println("Вы конвертируете рубли в " + currency);
        // Если currency равно "USD", то конвертируем в доллары, иначе в евро
        if(currency.equals("USD")) {
            System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
        } else {
            System.out.println("Ваши сбережения в евро: " + rubles / rateEUR);
        }
    }
}