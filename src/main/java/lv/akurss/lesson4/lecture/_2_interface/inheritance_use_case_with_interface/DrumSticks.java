package lv.akurss.lesson4.lecture._2_interface.inheritance_use_case_with_interface;

public class DrumSticks extends Item {
	
	public DrumSticks(double price, String title) {
		super(price, title);
	}

	@Override
	public boolean isInstrument() {
		return false;
	}
}
