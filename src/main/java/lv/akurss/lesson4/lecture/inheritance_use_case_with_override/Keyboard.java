package lv.akurss.lesson4.lecture.inheritance_use_case_with_override;

public class Keyboard extends Item {
	
	private int keyCount;

	public Keyboard(double price, String title, int keyCount) {
		super(price, title);
		this.keyCount = keyCount;
	}

	public int getKeyCount() {
		return keyCount;
	}

	public void setKeyCount(int keyCount) {
		this.keyCount = keyCount;
	}
	
	@Override
	public void printTitle() {
		super.printTitle();
		System.out.println("I am keyboard");
	}
}
