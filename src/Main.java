/*
 - Ваш будущий профессиональный праздник принято отмечать в 256-й день года. В не високосный год он выпадает на 13 сентября, в високосный — на 12 сентября.
Напишите программу для определения даты празднования дня программиста.
- Формат данных:
На вход программа должна получать номер года, а на выходе выводить дату праздника в формате дд.мм.гггг.
Например, ввод: 2000, вывод: 12.09.2000.
 - Информационная справка:
Порядок определения високосного года:
годы, номер которых кратен 4, — високосные;
год, номер которого кратен 400, — високосный;
остальные годы, номер которых кратен 100, — не високосные (например, годы 1700, 1800, 1900, 2100, 2200, 2300).
- leap years: 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040
- non-leap years: 1997, 1999, 2001, 2003, 2005, 2007, 2009, 2011, 2013, 2015, 2017, 2019, 2021
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            // здесь нужно вывести результат
            System.out.println("Leap year: 12.09." + year);
        } else {
            System.out.println("Non-leap: 13.09." + year);
        }
    }

    public static boolean isLeapYear(int year) {
        // здесь нужно определить, является ли переданный год високосным
        if(year % 100 == 0) {
            return false;
        } else if(year % 4 == 0) {
            return true;
        } else if(year % 400 == 0) {
            return true;
        }
        return false;
    }
}