/*
Новый год — это всегда суета, огромное число подарков и поздравлений. Родные, друзья, коллеги, одногруппники.
Приложение NewYearReminder напомнит о приближении Нового года и поможет с поздравлениями.
Пользователю нужно только указать имя <contact>, остальное приложение берёт на себя.
Чтобы поздравить близких друзей, им нужно позвонить и позвать на кофе.
Чтобы поздравить коллег, нужно отправить электронное письмо с новогодней картинкой через корпоративную почту.
Одногруппники порадуются стикеру в социальных сетях. А родственники в любом уголке планеты оценят бумажную открытку в почтовом ящике.
Приложение работает с адресной книгой в телефоне, по тегам оно создаёт четыре списка контактов ContactBook.
Допишите код приложения так, чтобы пользователи могли поздравить любого человека из своей телефонной книги, просто указав его имя.
 */

import java.util.Scanner;

public class Practicum {

    // Дополните объявление поля friendsContactBook, которое будет хранить в себе список номеров телефонов друзей
    private static ContactBook<Phone> friendsContactBook = new ContactBook<>();
    // Напишите объявления полей colleaguesContactBook, classmatesContactBook и relativesContactBook,
    // которые будут хранить списки электронных адресов, соцсетей и почтовых адресов соответственно
    private static ContactBook<Email> colleaguesContactBook = new ContactBook<>();
    private static ContactBook<SocialNetworkContact> classmatesContactBook = new ContactBook<>();
    private static ContactBook<Address> relativesContactBook = new ContactBook<>();


    public static void main(String[] args) {
        fillBooks();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Сегодня Новый Год! 1 - Отправить поздравление, 0 - Напомнить позднее");
            int mainCommand = scanner.nextInt();
            if (mainCommand == 1) {
                System.out.println("Какую книгу контактов открыть?");
                System.out.println("1 - Друзья, 2 - Коллеги, 3 - Одногруппники, 4 - Родственники");

                int bookIndex = scanner.nextInt();
                if (bookIndex == 1) {
                    friendsContactBook.printList();
                } else if (bookIndex == 2) {
                    colleaguesContactBook.printList();
                } else if (bookIndex == 3) {
                    classmatesContactBook.printList();
                } else if (bookIndex == 4) {
                    relativesContactBook.printList();
                }

                System.out.println("Кого вы хотите поздравить? Введите имя:");
                String name = scanner.next();
                if (bookIndex == 1) {
                    friendsContactBook.congratulate(name);
                } else if (bookIndex == 2) {
                    colleaguesContactBook.congratulate(name);
                } else if (bookIndex == 3) {
                    classmatesContactBook.congratulate(name);
                } else if (bookIndex == 4) {
                    relativesContactBook.congratulate(name);
                }
            } else if (mainCommand == 0) {
                break;
            }
        }
    }

    private static void fillBooks() {
        friendsContactBook.addContact(new Phone("Иван", "+7-909-000-11-22"));
        friendsContactBook.addContact(new Phone("Маша", "+7-999-555-11-22"));
        friendsContactBook.addContact(new Phone("Кирилл", "+7-979-698-00-22"));

        colleaguesContactBook.addContact(new Email("Александр", "sasha@sasha.ru"));
        colleaguesContactBook.addContact(new Email("Павел", "pasha@pasha.ru"));
        colleaguesContactBook.addContact(new Email("Олег", "oleg@oleg.ru"));

        classmatesContactBook.addContact(new SocialNetworkContact("Оля", "НаСвязи", "olya"));
        classmatesContactBook.addContact(new SocialNetworkContact("Женя", "Фотопризма", "zhenya"));

        relativesContactBook.addContact(new Address("Бабуля", "Москва", "Тверская, д.8"));
        relativesContactBook.addContact(new Address("Дедуля", "Воронеж", "Ленина, д.10"));
    }

}