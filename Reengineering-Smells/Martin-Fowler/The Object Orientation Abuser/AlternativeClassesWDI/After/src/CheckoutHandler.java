package After.AlternativeClassesWithDifferentInterfaces.src;

import java.util.ArrayList;

public class CheckoutHandler {
	private ArrayList<Item> shoppingCart;
	private CurrencyConverter curconv;

    public CheckoutHandler() {
        this.shoppingCart = new ArrayList<>();
        this.curconv = new CurrencyConverter();
    }
    

    public void addItemToCart(Item item) {
        shoppingCart.add(item);
    }

    public void removeItemFromCart(Item item) {
        shoppingCart.remove(item);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Item item : shoppingCart) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public double convertToCurrency(double price, String currencyTo) {
        return curconv.convertToCurrency(price, currencyTo);
    }
    
    public ArrayList<Item> getCart() {
        return shoppingCart;
    }
}
