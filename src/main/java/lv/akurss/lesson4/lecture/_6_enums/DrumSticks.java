package lv.akurss.lesson4.lecture._6_enums;

public class DrumSticks extends Item {
	
	public DrumSticks(double price, String title) {
		super(price, title, Category.ACCESSORIES);
	}

	@Override
	public boolean isInstrument() {
		return false;
	}
}
