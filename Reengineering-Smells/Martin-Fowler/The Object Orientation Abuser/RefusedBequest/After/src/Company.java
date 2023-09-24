package After.src;


public class Company {
	private double revenues;
	private double expenses;
	private PersonalTaxCalculator TaxCalcu = new PersonalTaxCalculator();
	
	public Company(double revenues, double expenses) {
		this.revenues = revenues;
		this.expenses = expenses;
	}
	
	public double getIncome() {
		return revenues - expenses;
	}
	
	public double calculateTax(double income, double textRate) {
		return TaxCalcu.calculateTax(income, textRate);
	}
	
}
