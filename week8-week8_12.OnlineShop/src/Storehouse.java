import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> storehouse_stock;

    public Storehouse() {
        prices = new HashMap<String, Integer>();
        storehouse_stock = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        storehouse_stock.put(product, stock);
    }

    public int stock(String product) {
        int value = 0;
        for (String key: storehouse_stock.keySet()) {
            if (product.equals(key)) {
                value = storehouse_stock.get(key);
            }
        }
        return value;
    }

    public int price(String product) {
        for (String key: prices.keySet()) {
            if (product.equals(key)) {
                return prices.get(key);
            }
        }
        return -99;
    }

    public boolean take(String product) {
        boolean state = false;
        for (String key: storehouse_stock.keySet()) {
            if (product.equals(key) && this.stock(product) > 0) {
                storehouse_stock.put(product, storehouse_stock.get(product)-1);
                state = true;
            }
        }
        return state;
    }

    public Set<String> products() {
        Set<String> products = new HashSet<String>();

        for (Map.Entry<String, Integer> product: storehouse_stock.entrySet()) {
            products.add(product.getKey());
        }

        return products;

    }

}
