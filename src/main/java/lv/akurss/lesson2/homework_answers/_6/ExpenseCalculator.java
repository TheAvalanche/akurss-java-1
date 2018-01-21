package lv.akurss.lesson2.homework_answers._6;

public class ExpenseCalculator {

	private double totalAmount;

	public void addToExpenses(Expense expense) {
		totalAmount = totalAmount + expense.getAmount();
	}
	
	public void printTotal() {
		System.out.println("Total amount: " + totalAmount + "$");
	}
}
