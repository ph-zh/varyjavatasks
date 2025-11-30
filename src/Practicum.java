/*
В отделах кадров часто требуется искать работников по первым буквам фамилии.
От перебора бумажных картотек уже отказались — все персональные данные загружены в электронную базу.
Вам нужно реализовать метод boolean startsWith(String initial, String other),
который возвращает true, если фамилия работника initial начинается с подстроки other, иначе false.
*/
public class SubstringFunctions {
    public boolean startsWith(String initial, String other) {
        // реализуйте метод

        return initial.indexOf(other, 0) == 0;
    }
}