package After.AlternativeClassesWithDifferentInterfaces.src;


public class CurrencyConverter {
	private String currencyTo;


    public double convert(double price) {
    	if (currencyTo.equalsIgnoreCase("EUR")) {
            return price * 0.9;
        } else if (currencyTo.equalsIgnoreCase("IDR")) {
            return price * 15000;
        } else {
            throw new IllegalArgumentException("Unrecognized currency: " + currencyTo);
        }
    }


	public double convertToCurrency(double price, String currencyTo2) {
		// TODO Auto-generated method stub
		return price;
	}
}
