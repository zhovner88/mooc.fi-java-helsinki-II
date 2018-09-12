import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    private Map<String, Purchase> basket;

    public ShoppingBasket() {
        basket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if (basket.containsKey(product)) {
            for (Map.Entry<String, Purchase> key: basket.entrySet()) {
                if(product.equals(key.getKey())) {
                    Purchase matched = key.getValue();
                    matched.increaseAmount();
                    basket.put(product, matched);
                }
            }
        } else {
            basket.put(product, new Purchase(product, price));
        }
    }

    public int price() {
        int price = 0;
        for (Map.Entry<String, Purchase> key: basket.entrySet()) {
            Purchase eachPrice = key.getValue();
            price += eachPrice.price();
        }
        return price;
    }

    public void print() {
        for (Map.Entry<String, Purchase> key: basket.entrySet()) {
            Purchase eachItem = key.getValue();
            System.out.println(eachItem);
        }
    }

}
