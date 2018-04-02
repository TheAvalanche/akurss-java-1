package lv.akurss.refactoring.model;

import java.math.BigDecimal;

public class Expense {
	private BigDecimal amount;
	private String description;
	private Category category;

	public Expense(BigDecimal amount, Category category) {
		this.amount = amount;
		this.description = description;
		this.category = category;
	}

	public Expense(BigDecimal amount, Category category, String description) {
		this.amount = amount;
		this.category = category;
		this.description = description;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
				", description='" + description + '\'' +
				", category=" + category +
				'}';
	}
}
