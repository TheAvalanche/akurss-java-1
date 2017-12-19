package lv.akurss.lesson5.lecture.inheritance_use_case_with_enum;

public class Keyboard extends Item {
	
	private int keyCount;

	public Keyboard(double price, String title, int keyCount) {
		super(price, title, Category.KEYS);
		this.keyCount = keyCount;
	}

	public int getKeyCount() {
		return keyCount;
	}

	public void setKeyCount(int keyCount) {
		this.keyCount = keyCount;
	}

	@Override
	public boolean isInstrument() {
		return true;
	}
}
