package After;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("Product 1", 10);
        Item item2 = new Item("Product 2", 20);
        cart.addItem(item1);
        cart.addItem(item2);

        printItems(cart.getItems());
        double total = cart.calculateTotal();
        System.out.println("Total: $" + total);
    }

    public static void printItems(List<Item> items) {
        System.out.println("Items in the cart:");
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }
}