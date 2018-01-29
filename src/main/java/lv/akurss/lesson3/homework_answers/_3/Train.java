package lv.akurss.lesson3.homework_answers._3;

public class Train extends PublicTransport {
	
	private int carriageCount;

	public Train(int passengerCount, int carriageCount) {
		super(passengerCount);
		this.carriageCount = carriageCount;
	}

	@Override
	public int getPassengerCount() {
		return (super.getPassengerCount() * carriageCount);
	}
}
