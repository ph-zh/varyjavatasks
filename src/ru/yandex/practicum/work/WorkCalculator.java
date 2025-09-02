/*
Коллега помогал главному бухгалтеру и написал калькулятор рабочих часов, но не доделал работу и ушёл в отпуск.
Сотрудники компании рискуют остаться без выплат! Доработайте приложение и расставьте модификаторы доступа в соответствии
с логикой приложения.  Доступ к рабочим часам и имени работника нужно закрыть, чтобы уберечь эти данные.
А вот доступ к повышающему коэффициенту можно сделать максимально широким. Чтобы избежать ошибок при компиляции,
конструктор класса WorkCalculator тоже лучше сделать доступным. Кроме того, нужно предусмотреть публичный доступ
к интерфейсу калькулятора — всем его методам.
 */
package ru.yandex.practicum.work;

public class WorkCalculator {

    private int workingHours = 8;
    private String workerName;
    public double coefficient;

    public WorkCalculator(String newName) {
        workerName = newName;
    }

    public String getWorkerName() {
        return workerName;
    }

    public int calculate(int workDays) {
        return workDays * workingHours;
    }

    public double calculateWithCoefficient(int workDays) {
        return workDays * workingHours * coefficient;
    }
}