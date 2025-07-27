/*
Programmers' Day
Your future professional holiday is traditionally celebrated on the 256th day of the year.

In non-leap years, it falls on September 13.
In leap years, it falls on September 12.

Write a program that determines the date of Programmers' Day for a given year.

Input Format
The program should receive a year number as input.

Output Format
The program should output the date of the holiday in the format:
dd.mm.yyyy

Example:
Input: 2000
Output: 12.09.2000

Reference: Leap Year Rules
A year is considered leap if:

It is divisible by 400 (e.g., 1600, 2000);
Or it is divisible by 4, but not divisible by 100 (e.g., 1996, 2004, 2024);

All other years are non-leap years
(e.g., 1700, 1800, 1900, 2100, 2200, 2300).
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
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
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}