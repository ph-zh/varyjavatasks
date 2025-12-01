public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        int index = 0;

        while(text.contains(substring)) {
            index = text.indexOf(substring) + substring.length();
            break;
        }
        return index;
    }
}