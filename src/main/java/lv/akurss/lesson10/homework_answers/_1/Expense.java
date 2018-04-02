package lv.akurss.lesson10.homework_answers._1;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Expense implements Comparable<Expense> {
	private BigDecimal amount;
	private String name;
	private Category category;
	private LocalDateTime created;

	public Expense(BigDecimal amount, String name, Category category) {
		this.amount = amount;
		this.name = name;
		this.category = category;
		this.created = LocalDateTime.now();
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

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	@Override
	public int compareTo(Expense o) {
		return this.getAmount().compareTo(o.getAmount());
	}

	@Override
	public String toString() {
		return "Expense{" +
				"amount=" + amount +
				", name='" + name + '\'' +
				", category=" + category +
				", created=" + created +
				'}';
	}
}
