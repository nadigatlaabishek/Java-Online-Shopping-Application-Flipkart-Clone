package Flipkart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public void viewCart() {
        System.out.println("===== View Shopping Cart =====");
        if (items.isEmpty()) {
            System.out.println("Your shopping cart is empty.");
        } else {
            for (Product product : items) {
                System.out.println("Product: " + product.getName());
                System.out.println("Description: " + product.getDescription());
                System.out.println("Price: $" + product.getPrice());
                System.out.println();
            }
        }
    }

    public boolean containsItem(Product product) {
        return items.contains(product);
    }
}
