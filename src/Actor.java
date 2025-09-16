import java.util.Objects;

public class Actor {
    String firstName;
    String lastName;

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // проверяем адреса объектов
        if (obj == null) return false; // проверяем ссылку на null
        if (this.getClass() != obj.getClass()) return false; // сравниваем классы объектов
        Actor anotherActor = (Actor) obj; // привели второй объект к классу Movie
        return Objects.equals(firstName, anotherActor.firstName) && // проверяем поля
               Objects.equals(lastName, anotherActor.lastName); // примитивы сравниваем через ==
    }

    @Override
    public int hashCode() {
        // вызываем вспомогательный метод и передаём в него нужные поля
        int hash = 17;
        if (firstName != null) {
            hash = hash + firstName.hashCode();
        }
        hash = hash * 31;

        if (lastName != null) {
            hash = hash + lastName.hashCode();
        }
        return hash;
    }
}