/*

*/
public class Main {
    public static void main(String[] args) {
        String firstNumber = "123.45";
        String secondNumber = "234.56";
        System.out.println(addNumbers(firstNumber, secondNumber));
    }

    private static Float addNumbers(String firstNumber, String secondNumber) {
        return (Float.parseFloat(firstNumber) + Float.parseFloat(secondNumber));
    }
}