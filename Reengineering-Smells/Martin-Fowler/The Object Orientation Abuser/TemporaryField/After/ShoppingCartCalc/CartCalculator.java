package After.ShoppingCartCalc;
import java.util.ArrayList;
import java.util.List;


public class CartCalculator {

	private List<Item> items;
	private double totalPrice;
	
	public CartCalculator(List<Item> items) {
		this.items = items;
		this.totalPrice = 0.0;
		
		for(Item item : items) {
			totalPrice += item.getPrice();
		}
	}
	
	public void UpdateTotal(double price) {
		totalPrice += price;
	}
	
	public double getTotal() {
		return totalPrice;
	}
}
