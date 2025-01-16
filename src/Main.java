import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String unit;
        float temp;

        System.out.println("Is the temperature in (F) or (C)? ");
        unit = scanner.nextLine();

        unit = unit.toUpperCase();

        if(unit.equals("C")) {
            System.out.println("Enter temperature in Celcius: ");
            temp = scanner.nextFloat();
            temp = temp * 9 / 5 + 32;
            System.out.println("The temp in Fahrenheit is: " + temp);

        } else if (unit.equals("F")) {
            System.out.println("Enter temperature in Fahrenheit: ");
            temp = scanner.nextFloat();
            temp = (temp - 32) * 5 / 9;
            System.out.println("The temp in Celcius is: " + temp);

        } else {
            System.out.println(unit + " is not a valid unit of measurement");
        }

    }
}