import java.util.Scanner;

public class MobilePhone extends Phone {

    Scanner scanner = new Scanner(System.in);

    @Override
    public String getNumber() {
        return super.getNumber();
    }
    public MobilePhone(String number) {
        super(number);
    }

    public final void sendSms(String targetNumber, String messageText) {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }

    public void makeCall(String targetNumber) {
        System.out.println("Введите SMS сообщение");
        String messageText = scanner.nextLine();
        sendSms(targetNumber, messageText);
        System.out.println("Звоним с номера " + getNumber());
        System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
        System.out.println("Привет!");
    }


}