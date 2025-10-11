// Допишите реализацию класса Smartphone
public class Smartphone extends MobilePhone{

    public Smartphone(String name) {
        super(name);
    }

    public final void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

}