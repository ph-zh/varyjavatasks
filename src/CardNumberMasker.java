/*
Попробуйте реализовать такое сокрытие строки самостоятельно — напишите метод maskCardNumber,
который принимает строку с номером карты из 16-ти символов и оставляет в ней только первые
четыре и последние четыре символа. Остальные замените на *.
*/
public class CardNumberMasker {
    public String maskCardNumber(String cardNumber) {
     	 // реализуйте вашу версию метода здесь

        return cardNumber.substring(0,4) + " " + "**** ****" + " " + cardNumber.substring(cardNumber.length() - 4);

    }

    public static void main(String[] args) {
        CardNumberMasker masker = new CardNumberMasker();
        System.out.println(masker.maskCardNumber("1234567890123456"));
    }
}