public class Main {
    public static void main(String[] args) {

        String[] cars = {"Toyota", "BMW", "KIA"};
        cars[0] = "Mustang";
            for (int i = 0; i < cars.length; i++) {
                System.out.println(i + 1 + ". " + cars[i]);
            }
        System.out.println("Number of cars in the pool: " + cars.length);
    }
}