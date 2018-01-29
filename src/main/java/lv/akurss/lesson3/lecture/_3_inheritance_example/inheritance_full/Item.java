package lv.akurss.lesson3.lecture._3_inheritance_example.inheritance_full;

public abstract class Item {
	
	private double price;
	private String title;

	public Item(double price, String title) {
		this.price = price;
		this.title = title;
	}
	
	public abstract boolean isInstrument();

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
	
	public void printTitle() {
		System.out.println("I am " + title);
	}
}
