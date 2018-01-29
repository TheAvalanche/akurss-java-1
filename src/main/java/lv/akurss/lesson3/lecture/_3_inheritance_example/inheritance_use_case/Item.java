package lv.akurss.lesson3.lecture._3_inheritance_example.inheritance_use_case;

public class Item {
	private double price;
	private String title;

	public Item(double price, String title) {
		this.price = price;
		this.title = title;
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
}
