/*
🦉 Перед вами программа, которая хранит доступные авиабилеты и цены на них. Измените код таким образом, чтобы билеты
хранились в упорядоченном виде — от самых дешёвых к более дорогим. Для этого используйте Comparator.
*/
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Practicum {



    public static void main(String[] args) {
        Comparator<Ticket> comparator = new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                return o1.priceInUsd - o2.priceInUsd;
            }
        };

        Set<Ticket> tickets = new TreeSet<>(comparator);
        fillTickets(tickets);

        System.out.println("Доступные билеты: ");
        for (Ticket ticket : tickets) {
            System.out.println("  * " + ticket);
        }
    }

    private static void fillTickets(Set<Ticket> tickets) {
        tickets.add(new Ticket("Лондон", "Париж", 376));
        tickets.add(new Ticket("Милан", "Москва", 298));
        tickets.add(new Ticket("Берлин", "Бостон", 1273));
        tickets.add(new Ticket("Пекин", "Рим", 846));
        tickets.add(new Ticket("Санкт-Петербург", "Афины", 284));
        tickets.add(new Ticket("Сидней", "Токио", 1738));
        tickets.add(new Ticket("Мюнхен", "Дубай", 974));
    }

    public static class Ticket {
        public String from;
        public String to;
        public int priceInUsd;

        public Ticket(String from, String to, int priceInUsd) {
            this.from = from;
            this.to = to;
            this.priceInUsd = priceInUsd;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ticket ticket = (Ticket) o;

            if (priceInUsd != ticket.priceInUsd) return false;
            if (!from.equals(ticket.from)) return false;
            if (!to.equals(ticket.to)) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = from.hashCode();
            result = 31 * result + to.hashCode();
            result = 31 * result + priceInUsd;
            return result;
        }

        @Override
        public String toString() {
            return "Ticket{from=" + from + ", to=" + to + ", priceInUsd=" + priceInUsd + '}';
        }
    }
}