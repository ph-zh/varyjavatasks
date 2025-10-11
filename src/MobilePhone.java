public class MobilePhone extends Phone {

    public MobilePhone(String name) {
        super(name);
    }

    public final void sendSms(String targetNumber, String messageText) {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }
}