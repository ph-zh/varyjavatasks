/*

*/
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> expenses = new ArrayList<>();
        expenses.add(120.43);
        expenses.add(290.34);
        expenses.add(420.1);
        expenses.add(3, 100.0);

        System.out.println(expenses);
    }
}