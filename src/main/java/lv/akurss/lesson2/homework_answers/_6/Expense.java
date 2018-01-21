package lv.akurss.lesson2.homework_answers._6;

public class Expense {
	
	private double amount;
	private String category;

	public Expense(double amount, String category) {
		this.amount = amount;
		this.category = category;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
