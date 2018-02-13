package lv.akurss.lesson5.homework_answers._1;

public class Train extends PublicTransport {
	
	private int carriageCount;

	public Train(int passengerCount, int carriageCount) {
		super(passengerCount);
		this.carriageCount = carriageCount;
	}

	public int getCarriageCount() {
		return carriageCount;
	}

	public void setCarriageCount(int carriageCount) {
		this.carriageCount = carriageCount;
	}

	@Override
	public int getPassengerCount() {
		return (super.getPassengerCount() * carriageCount);
	}

	@Override
	public String toString() {
		return "Train{" +
				"carriageCount=" + carriageCount +
				'}';
	}
}
