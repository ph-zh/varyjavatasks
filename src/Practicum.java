/*

*/
public class Practicum {
    public static void main(String[] args) { // вызов main
        calculate1(); // вызов calculate1()
    }

    public static void calculate1() {
        calculate2();  // вызов calculate2()
    }

    public static void calculate2() {
        calculate3(); // вызов calculate3()
    }

    public static void calculate3() {
        calculate4(); // вызов calculate4()
    }

    public static void calculate4() {
        System.out.println(10 / 1); // исключение - методы не могут завершить работу
    }
}