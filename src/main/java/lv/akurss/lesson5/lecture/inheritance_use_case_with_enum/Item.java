package lv.akurss.lesson5.lecture.inheritance_use_case_with_enum;

public abstract class Item {
	private double price;
	private String title;
	private Category category;

	public Item(double price, String title, Category category) {
		this.price = price;
		this.title = title;
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public abstract boolean isInstrument();
}
