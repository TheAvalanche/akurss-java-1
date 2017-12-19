package lv.akurss.lesson5.lecture.homework_answers;

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
