package lv.akurss.lesson4.lecture.practice;

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
