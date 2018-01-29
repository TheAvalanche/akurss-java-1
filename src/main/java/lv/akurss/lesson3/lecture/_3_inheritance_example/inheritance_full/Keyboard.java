package lv.akurss.lesson3.lecture._3_inheritance_example.inheritance_full;

public class Keyboard extends Item {
	
	private int keyCount;

	public Keyboard(double price, String title, int keyCount) {
		super(price, title);
		this.keyCount = keyCount;
	}

	@Override
	public boolean isInstrument() {
		return true;
	}

	@Override
	public void printTitle() {
		super.printTitle();
		System.out.println("I am keyboard!");
	}
}
