package lv.akurss.lesson6.lecture.homework_answers;

public class DefaultRoutePlanner implements RoutePlanner {
	
	private String from;
	private String to;
	private int totalPassengers = 0;

	public DefaultRoutePlanner(String from, String to) {
		this.from = from;
		this.to = to;
	}

	@Override
	public void addToRoute(PublicTransport publicTransport) {
		totalPassengers = totalPassengers + publicTransport.getPassengerCount();
	}
	
	@Override
	public void calculateTotal() {
		System.out.println("Route from " + from + " to " + to + " can take up to " + totalPassengers + " passengers");
	}
	
	
}
