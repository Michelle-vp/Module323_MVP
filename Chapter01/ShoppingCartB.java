package Chapter01;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartB {

    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
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
