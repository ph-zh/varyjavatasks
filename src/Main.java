/*

 */

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Пирожок", 35.0);
        System.out.println("Стоимость продукта - " + product.getPrice() + " руб.");
    }
}

class Product {
    private String name;
    private double price;

    public Product(String nameProduct, double priceProduct) {
        name = nameProduct;
        price = priceProduct;
    }

    public double getPrice() {
        return price;
    }
}