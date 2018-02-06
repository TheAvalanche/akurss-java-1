package lv.akurss.lesson4.homework_answers._1;

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
