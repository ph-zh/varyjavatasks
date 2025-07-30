/*

*/
public class Main {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        printMaxOfBytes(b1, b2);

        short sh1 = -5;
        short sh2 = 5;
        printMinOfShorts(sh1, sh2);
    }

    public static void printMaxOfBytes(byte b1, byte b2) {
        int max_of_bytes = Integer.max((int)b1, (int)b2);
        System.out.println(max_of_bytes);
    }

    public static void printMinOfShorts(short sh1, short sh2) {
        int min_of_shorts = Integer.min((int)sh1, (int)sh2);
        System.out.println(min_of_shorts);
    }
}