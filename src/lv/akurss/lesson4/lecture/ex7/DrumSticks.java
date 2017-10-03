package lv.akurss.lesson4.lecture.ex7;

public class DrumSticks extends Item {
	
	public DrumSticks(double price, String title) {
		super(price, title, Category.ACCESSORIES);
	}

	@Override
	public boolean isInstrument() {
		return false;
	}
}
