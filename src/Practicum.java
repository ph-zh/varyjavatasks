/*

*/
import java.util.HashSet;
import java.util.Set;

public class Practicum {
    // здесь хранятся номера всех выпущенных карт
    private static Set<String> issuedCards = new HashSet<>();

    public static void main(String[] args) {
        issuedCards.add("3688 2836 2367 0847");
        issuedCards.add("9522 4377 2788 9805");
        issuedCards.add("1278 6724 0988 4714");
        issuedCards.add("9142 7356 9815 9066");
        issuedCards.add("1168 9734 4967 2984");

        String newCard = generateNewCard();

        // проверим, свободен ли этот номер карты
        System.out.println("Номер карты " + newCard + " свободен? " + !issuedCards.contains(newCard));
    }

    public static String generateNewCard() {
        return "9734 3477 3844 3702";
    }
}