public class Capitalizator {
    public String capitalize(String str) {
        char firstLetter = str.toUpperCase().charAt(0);
        return firstLetter + str.substring(1);
    }
}