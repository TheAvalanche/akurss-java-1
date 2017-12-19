package lv.akurss.lesson5.lecture.inheritance_use_case_with_instance_of;

public abstract class Item {
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
	
	public abstract boolean isInstrument();
}
