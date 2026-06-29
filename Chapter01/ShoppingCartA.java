package Chapter01;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartA {

    private List<String> items = new ArrayList<>();
    private boolean hasBook = false;

    public void addItem(String item) {
        items.add(item);

        if (item.equals("Buch")) {
            hasBook = true;
        }
    }

    public void removeItem(String item) {
        items.remove(item);

        hasBook = items.contains("Buch");
    }

    public List<String> getItems() {
        return items;
    }

    public int getDiscount() {
        if (hasBook) {
            return 5;
        }

        return 0;
    }
}