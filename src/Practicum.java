/*

*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Practicum {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Item("Рубашка", 4500, 37));
        items.add(new Item("Носки", 55, 8));
        items.add(new Item("Толстовка", 1399, 74));
        items.add(new Item("Носки", 169, 19));

        System.out.println("До сортировки:");
        System.out.println(items);

        // компаратор по цене от дешёвого к дорогому
        ItemPriceComparator itemPriceComparator = new ItemPriceComparator();

        // применяем его
        items.sort(itemPriceComparator);

        System.out.println("После сортировки по возрастанию цены:");
        System.out.println(items);

        // создаём обратный компаратор цен
        Comparator<Item> reversedItemPriceComparator = itemPriceComparator.reversed();

        // применяем его
        items.sort(reversedItemPriceComparator);
        System.out.println("После сортировки по убыванию цены:");
        System.out.println(items);
    }

    static class Item {

        // Наименование товара.
        public final String name;

        // Цена товара.
        public final int price;

        // Популярность товара.
        public final int popularity;

        public Item(String name, int price, int popularity) {
            this.name = name;
            this.price = price;
            this.popularity = popularity;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", popularity=" + popularity +
                    '}';
        }
    }

    static class ItemPriceComparator implements Comparator<Item> {

        @Override
        public int compare(Item item1, Item item2) {
            return Integer.compare(item1.price, item2.price);
        }
    }
}