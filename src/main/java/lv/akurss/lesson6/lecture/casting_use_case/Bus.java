package lv.akurss.lesson6.lecture.casting_use_case;

public class Bus extends Transport {
	
	private int sitCount;

	public Bus(int maxSpeed, int sitCount) {
		super(maxSpeed);
		this.sitCount = sitCount;
	}

	public int getSitCount() {
		return sitCount;
	}

	public void setSitCount(int sitCount) {
		this.sitCount = sitCount;
	}
}
