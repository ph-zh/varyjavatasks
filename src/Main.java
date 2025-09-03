/*
Вам нужно снять наличные в банкомате, но он сломался и выводит только консоль с недописанным кодом.
По счастливой случайности — на Java. Допишите код — реализуйте методы в классе BankAccount.
Чтобы установить и считать значение суммы денег на счёте moneyAmount, вам понадобятся get- и set-методы.
Чтобы снять деньги со счёта и обнулить его — метод withdrawAll(), который должен обнулять счёт и печатать
количество выданных денег в формате: Со счёта снято 1000 р. Все методы должны иметь самый широкий уровень доступа.
В результате запуска программы в консоли должно появиться:

- Количество денег на счету - 1000 р. (сумма может быть любой)
- Со счёта снято 1000 р.
- Количество денег на счету - 0 р.
 */

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        long moneyAmount = 1000; // передайте в банкомат сумму на счету
        bankAccount.setMoneyAmount(moneyAmount);
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
        bankAccount.withdrawAll(); // вызовите метод вывода средств
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
    }
}

class BankAccount {
    private long moneyAmount;

    // допишите код методов
    // используйте параметр newMoneyAmount для установки нового значения
    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(long newMoneyAmount) {
        moneyAmount = newMoneyAmount;
    }

    public void withdrawAll() {
        System.out.println("Со счёта снято " + moneyAmount + " р.");
        moneyAmount -= moneyAmount;
    }
}