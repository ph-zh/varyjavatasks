/*

 */

public class Practicum {

    public static void main(String[] args) {
        int[] array = new int[] {1, 5, 3, 2, 9, 1, 2, 3, 4, 1, 10};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println(sum);
    }

}