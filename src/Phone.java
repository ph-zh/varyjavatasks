public abstract class Phone {
    private final String number;

    public Phone(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void makeCall(String targetNumber) {
        System.out.println("Звоним с номера " + number);
        System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
        System.out.println("Привет!");
    }
}