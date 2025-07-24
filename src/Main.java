/*

 */
public class Main {
    public static void main(String[] args) {
        Hamster bite = new Hamster(); // Имя Байта менять не нужно
        bite.eat(35); // 370
        for (int i = 0; i < 3; i++) {
            bite.runInWheel();
        }
        System.out.println("Bite weight" + bite.weight);

        Hamster ninja = new Hamster();
        ninja.name = "Ниндзя";
        ninja.weight = 250;
        ninja.runInWheel(); // 290
        if (ninja.weight < 265) {
            ninja.eat(45);
        }
        System.out.println("Ninja weight" + ninja.weight);

        Hamster kuzya = new Hamster();
        kuzya.name = "Кузя";
        kuzya.weight = 450;
        kuzya.weight = 325;
        kuzya.eat(20); // 345
        System.out.println("Kuzya weight" + kuzya.weight);

        Hamster paskal = new Hamster();
        paskal.name = "Паскаль";
        paskal.weight = 320; // 320
        System.out.println("Paskal weight" + paskal.weight);
    }
}