/*
Измените остаток средств на счету так, чтобы приложение порекомендовало поужинать в Макдоналдсе.
 */
class Main {
    public static void main(String[] args) {
        double moneyBeforeSalary = 9000.0; // Количество денег до зарплаты

        if (moneyBeforeSalary < 3000) {
            System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
        } else if (moneyBeforeSalary < 10000) {
            System.out.println("Окей, пора в Макдак!");
        } else {
            System.out.println("Класс! Заказывайте крабов!");
        }
    }
}