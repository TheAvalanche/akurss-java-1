package lv.akurss.lesson5.lecture.inheritance_use_case_with_enum;

public class DrumSticks extends Item {
	
	public DrumSticks(double price, String title) {
		super(price, title, Category.ACCESSORIES);
	}

	@Override
	public boolean isInstrument() {
		return false;
	}
}
