package lv.akurss.lesson4.lecture.homework_answers2;

public class ExpenseCalculator {

	private double totalAmount;

	public void addToExpenses(Expense expense) {
		totalAmount = totalAmount + expense.getAmount();
	}
	
	public void printTotal() {
		System.out.println("Total amount: " + totalAmount + "$");
	}
}
