package lv.akurss.lesson6.lecture.casting_use_case;

public class Car extends Transport {
	
	private int wheels;

	public Car(int maxSpeed, int wheels) {
		super(maxSpeed);
		this.wheels = wheels;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
}
