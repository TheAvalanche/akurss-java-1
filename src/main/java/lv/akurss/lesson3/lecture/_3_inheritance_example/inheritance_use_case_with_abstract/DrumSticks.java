package lv.akurss.lesson3.lecture._3_inheritance_example.inheritance_use_case_with_abstract;

public class DrumSticks extends Item {
	
	public DrumSticks(double price, String title) {
		super(price, title);
	}

	@Override
	public boolean isInstrument() {
		return false;
	}
}
