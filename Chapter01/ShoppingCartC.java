package Chapter01;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartC {

    private final List<String> items;

    public ShoppingCartC() {
        this.items = List.of();
    }

    private ShoppingCartC(List<String> items) {
        this.items = List.copyOf(items);
    }

    public ShoppingCartC addItem(String item) {
        List<String> newItems = new ArrayList<>(items);
        newItems.add(item);

        return new ShoppingCartC(newItems);
    }

    public ShoppingCartC removeItem(String item) {
        List<String> newItems = new ArrayList<>(items);
        newItems.remove(item);

        return new ShoppingCartC(newItems);
    }

    public List<String> getItems() {
        return items;
    }

    public int getDiscount() {
        if (items.contains("Buch")) {
            return 5;
        }

        return 0;
    }
}
