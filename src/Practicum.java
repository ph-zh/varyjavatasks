/*

 */

public class Practicum {

    public static void main(String[] args) {
        Pair pair = new Pair(4, 1);
        System.out.println("Координаты игрока на карте:");
        pair.print();
        Integer x = pair.getKey();
        Integer y = pair.getValue();

        System.out.println();

        StringPair stringPair = new StringPair("username", "motherload");
        System.out.println("Чит-код пользователя:");
        stringPair.print();
        String user = stringPair.getKey();
        String cheatCode = stringPair.getValue();
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
class StringPair {
    public final String key;
    public final String value;

    public StringPair(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public void print() {
        System.out.printf("(%s, %s)", key, value);
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

