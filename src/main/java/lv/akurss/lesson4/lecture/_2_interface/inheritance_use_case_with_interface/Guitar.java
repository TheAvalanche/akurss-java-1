package lv.akurss.lesson4.lecture._2_interface.inheritance_use_case_with_interface;

public class Guitar extends Item {
	
	private int stringCount;
	
	public Guitar(double price, String title, int stringCount) {
		super(price, title);
		this.stringCount = stringCount;
	}

	public int getStringCount() {
		return stringCount;
	}

	public void setStringCount(int stringCount) {
		this.stringCount = stringCount;
	}

	@Override
	public boolean isInstrument() {
		return true;
	}
}
