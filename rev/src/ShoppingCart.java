import java.util.ArrayList;
import java.util.List;

public final class ShoppingCart {
    private final String customerName;
    private final List<String> items;

    public ShoppingCart(String customerName, ArrayList<String> items) {
        this.customerName = customerName;
        this.items = new ArrayList<>(items);
    }

    public ArrayList<String> getItems() {
        return new ArrayList<>(items);
    }
    public String getCustomerName(){
        return this.customerName;
    }

    public final ShoppingCart getShoppingCart(String name, ArrayList<String> items){
        return new ShoppingCart(name, items);
    }
}