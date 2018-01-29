package lv.akurss.lesson3.lecture._3_inheritance_example.inheritance_full;

public class Guitar extends Item {
	
	private int stringCount;
	
	public Guitar(double price, String title, int stringCount) {
		super(price, title);
		this.stringCount = stringCount;
	}
	
	@Override
	public boolean isInstrument() {
		return true;
	}

	@Override
	public void printTitle() {
		System.out.println("I am " + getTitle() + " with " + stringCount + " strings");
	}
}
