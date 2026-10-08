public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(101, "Смартфон", 79990, "Сотовая связь");
        Product product2 = new Product(102, "Наушники", 6500, "Аксессуары");
        Product product3 = new Product(101, "Смартфон", 79990, "Сотовая связь");

        System.out.println();
        System.out.println("Товары:");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        System.out.println();
        System.out.println("Сравнение товаров:");
        System.out.println("product1 == product2: " + product1.equals(product2));
        System.out.println("product1 == product3: " + product1.equals(product3));
        System.out.println("product1 == null: " + product1.equals(null));

        Product[] basket1 = {product1, product2};
        Product[] basket2 = {product1, product2};
        Product[] basket3 = {product2, product1};

        Order order1 = new Order("Алексей Иванов", basket1);
        Order order2 = new Order("Константин Леонидович", basket2);
        Order order3 = new Order("Алексей Иванов", basket3);

        System.out.println();
        System.out.println("Заказы:");
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);

        System.out.println();
        System.out.println("Сравнение заказов:");
        System.out.println("order1 == order2: " + order1.equals(order2));
        System.out.println("order1 == order3: " + order1.equals(order3));
        System.out.println("order1 == null: " + order1.equals(null));
    }
}