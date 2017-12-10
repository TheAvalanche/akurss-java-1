package lv.akurss.lesson14.lecture.refactoring.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Expense {
	
	private LocalDateTime created = LocalDateTime.now();
	private BigDecimal amount;
	private Category category;
	private String description;

	public Expense(BigDecimal amount, Category category) {
		this.amount = amount;
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

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Expense{" +
				"amount=" + amount +
				", description='" + description + '\'' +
				", category=" + category +
				", created=" + created +
				'}';
	}
	
}
