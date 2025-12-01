/*
Попробуйте реализовать такое сокрытие строки самостоятельно — напишите метод maskCardNumber,
который принимает строку с номером карты из 16-ти символов и оставляет в ней только первые
четыре и последние четыре символа. Остальные замените на *.
*/
public class CardNumberMasker {
    public String maskCardNumber(String cardNumber) {
     	 // реализуйте вашу версию метода здесь
        String first4 = cardNumber.substring(0,4);
        String last4 = cardNumber.substring(12,16);
        String middle = "**** ****";

        return first4 + " " + middle + " " + last4;

    }

    public static void main(String[] args) {
        CardNumberMasker masker = new CardNumberMasker();
        System.out.println(masker.maskCardNumber("1234567890123456"));
    }
}