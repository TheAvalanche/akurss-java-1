package lv.akurss.lesson4.lecture.ex6;

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
	public boolean isInstrument() {
		return true;
	}
}
