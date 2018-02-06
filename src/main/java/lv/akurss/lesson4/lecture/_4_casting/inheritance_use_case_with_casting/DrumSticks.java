package lv.akurss.lesson4.lecture._4_casting.inheritance_use_case_with_casting;

public class DrumSticks extends Item {
	
	public DrumSticks(double price, String title) {
		super(price, title);
	}

	@Override
	public boolean isInstrument() {
		return false;
	}
}
