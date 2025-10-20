/*

 */

public class Practicum {

    public static void main(String[] args) {
        Pair pair = new Pair(4, 1);
        System.out.println("Координаты игрока на карте:");
        pair.print();
        Integer x = pair.getKey();
        Integer y = pair.getValue();
    }

}
class Pair {
    public final Integer key;
    public final Integer value;

    public Pair(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public void print() {
        System.out.printf("(%s, %s)", key, value);
    }

    public Integer getKey() {
        return key;
    }

    public Integer getValue() {
        return value;
    }
}
