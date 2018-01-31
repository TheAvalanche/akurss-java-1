package lv.akurss.lesson4.lecture._1_abstract.inheritance_full;

public class DrumSticks extends Item {

	public DrumSticks(double price, String title) {
		super(price, title);
	}

	@Override
	public boolean isInstrument() {
		return false;
	}
}
