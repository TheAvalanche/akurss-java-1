package lv.akurss.lesson4.lecture.practice;

public class DrumSticks extends Item {

	public DrumSticks(double price, String title) {
		super(price, title);
	}

	@Override
	public boolean isInstrument() {
		return false;
	}
}
