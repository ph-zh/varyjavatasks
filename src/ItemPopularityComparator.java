/*
🦉 Аналогичным образом напишите компаратор для сравнения товаров по популярности ItemPopularityComparator.
Учитывайте, что товарам присваивается рейтинг в диапазоне от 1 до 100, где 1 — самый непопулярный товар, а 100 — самый популярный.
*/

import java.util.Comparator;

public class ItemPopularityComparator implements Comparator<ItemPopularityComparator.Item> {

    public static void main(String[] args){

    }

    @Override
    public int compare(Item item1, Item item2) {
        // Напишите правильное сравнение.
        if (item1.popularity > item2.popularity) {
            return 1;
        } else if (item1.popularity < item2.popularity) {
            return -1;
        } else {
            return 0;
        }
    }

    static class Item {

        public final String name;
        public final int price;
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
}