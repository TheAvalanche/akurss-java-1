package lv.akurss.lesson5.lecture.homework_answers;

public abstract class PublicTransport {
	
	private int passengerCount;

	public PublicTransport(int passengerCount) {
		this.passengerCount = passengerCount;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}
	
}
