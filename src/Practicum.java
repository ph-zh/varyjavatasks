/*

 */

interface Document {
    public String getDocumentNumber();
}

class RussianPassport implements Document {
    private final String series;
    private final String number;

    public RussianPassport(String series, String number) {
        this.series = series;
        this.number = number;
    }

    @Override
    public String getDocumentNumber() {
        return series + " " + number;
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }
}


public class Practicum {

    public static void main(String[] args) {
        // Java автоматически привела объект класса RussianPassport к типу интерфейса Document
        Document document = new RussianPassport("1111", "567899");
        System.out.println(document.getDocumentNumber());

    }

}