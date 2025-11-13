/*
🦉В приведённом ниже коде находится сопоставление пользователей и стран, в которых они живут.
Эти данные хранятся в TreeMap в упорядоченном виде — от наименьшего ID пользователя к большему.
Запустите программу и удостоверьтесь в этом! Ваша задача — изменить код таким образом,
чтобы пользователи были отсортированы по именам —  от «А» до «Я». Для этого нужно изменить логику компаратора userComparator.
*/
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Practicum {
    public static void main(String[] args) {
        Comparator<User> userComparator = new Comparator<>() {
            @Override
            public int compare(User user1, User user2) {
                return user1.userId - user2.userId;
            }
        };

        Map<User, String> users = new TreeMap<>(userComparator);
        fillWithData(users);

        System.out.println("Пользователи: ");
        for (Map.Entry<User, String> entry : users.entrySet()) {
            System.out.println(entry);
        }
    }

    private static void fillWithData(Map<User, String> users) {
        users.put(new User(545, "Николай"), "Россия");
        users.put(new User(8934, "Томас"), "Португалия");
        users.put(new User(45, "Ив"), "Франция");
        users.put(new User(5758, "Лили"), "Италия");
        users.put(new User(247, "Винг"), "Гонконг");
    }
}

class User {
    Integer userId;
    String name;

    public User(Integer userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return userId.equals(user.userId);
    }

    @Override
    public int hashCode() {
        return userId.hashCode();
    }

    @Override
    public String toString() {
        return "User{userId=" + userId + ", name=" + name + "}";
    }
}