package lv.akurss.lesson5.lecture.inheritance_use_case_with_instance_of;

public class DrumSticks extends Item {
	
	public DrumSticks(double price, String title) {
		super(price, title);
	}

	@Override
	public boolean isInstrument() {
		return false;
	}
}
