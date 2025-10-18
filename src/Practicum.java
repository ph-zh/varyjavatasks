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

class Snils implements Document {
    private final String number;

    public Snils(String number) {
        this.number = number;
    }

    @Override
    public String getDocumentNumber() {
        return number;
    }
}


public class Practicum {

    public static void main(String[] args) {
        Document document2 = new Snils("12345678901");

        RussianPassport passport = (RussianPassport) document2;
        System.out.println(passport.getSeries());
        System.out.println(passport.getNumber());
    }

}