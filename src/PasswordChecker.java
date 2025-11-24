/*

*/
public class PasswordChecker {
    public boolean checkPassword(String password) {
        if (password.isEmpty()) { // проверяем, не является ли строка пустой
            System.out.println("Пароль отсутствует.");
            return false;
        } else if (password.length() < 8) { // размер строки не должен быть меньше 8 символов
            System.out.println("Пароль слишком короткий.");
            return false;
        }
        System.out.println("Подходящий пароль.");
        return true;
    }

    public static void main(String[] args) {
        PasswordChecker checker = new PasswordChecker();

        System.out.println(checker.checkPassword(""));           // false
        System.out.println(checker.checkPassword("S34fd1265Jd")); // true
        System.out.println(checker.checkPassword("          "));  // true
        System.out.println(checker.checkPassword("shortpw"));    // false
    }
}