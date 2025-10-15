// Допишите реализацию класса Smartphone
public class Smartphone extends MobilePhone {

    public Smartphone(String number) {
        super(number);
    }

    public final void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

    public void makeCall(String targetNumber) {
        System.out.println("Введите email");
        String email = scanner.nextLine();
        System.out.println("Введите сообщение");
        String messageText = scanner.nextLine();
        sendEmail(email, messageText);
        System.out.println("Введите имя приложения");
        String appName = scanner.nextLine();
        sendEmail(email,messageText);
        super.sendSms(targetNumber, messageText);
        System.out.println("Позвоним через приложение " + appName + " по номеру " + targetNumber);
        System.out.println("Звоним с номера " + getNumber());
        System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
        System.out.println("Привет!");
    }
}