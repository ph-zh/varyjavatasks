/*

*/
public class Practicum {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hhellllllo!");
        builder.deleteCharAt(1); // удалит элемент 'h'
        builder.delete(2, 6);    // удалит все лишние символы 'l'
        System.out.println(builder.toString()); // выведет строку "Hello!"
    }
}