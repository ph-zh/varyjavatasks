/*

 */
public class Practicum {

    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>(4, 1);
        System.out.println("Координаты точки с целочисленными координатами:");
        pair.print();
        Integer x = pair.getKey();
        Integer y = pair.getValue();

        System.out.println();

        Pair<String> stringPair = new Pair<>("Content-Type", "application/json");
        System.out.println("Заголовок HTTP запроса:");
        stringPair.print();
        String header = stringPair.getKey();
        String headerValue = stringPair.getValue();
    }

}
class Pair<T> {
    public final T key;
    public final T value;

    public Pair(T key, T value) {
        this.key = key;
        this.value = value;
    }

    public void print() {
        System.out.printf("(%s, %s)", key, value);
    }

    public T getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }
}