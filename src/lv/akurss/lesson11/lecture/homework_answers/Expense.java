package lv.akurss.lesson11.lecture.homework_answers;

import java.math.BigDecimal;
import java.util.Comparator;

public class Expense {
	private BigDecimal amount;
	private String name;
	private Category category;

	public Expense(BigDecimal amount, String name, Category category) {
		this.amount = amount;
		this.name = name;
		this.category = category;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Expense{" +
				"amount=" + amount +
				", name='" + name + '\'' +
				", category=" + category +
				'}';
	}
	
	public static class ExpenseComparator implements Comparator<Expense> {

		@Override
		public int compare(Expense o1, Expense o2) {
			return o1.getAmount().compareTo(o2.getAmount());
		}
	}
}
