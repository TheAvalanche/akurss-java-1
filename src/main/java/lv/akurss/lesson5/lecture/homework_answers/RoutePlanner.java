package lv.akurss.lesson5.lecture.homework_answers;

public class RoutePlanner {
	
	private String from;
	private String to;
	private int totalPassengers = 0;

	public RoutePlanner(String from, String to) {
		this.from = from;
		this.to = to;
	}

	public void addToRoute(PublicTransport publicTransport) {
		totalPassengers = totalPassengers + publicTransport.getPassengerCount();
	}
	
	public void calculateTotal() {
		System.out.println("Route from " + from + " to " + to + " can take up to " + totalPassengers + " passengers");
	}
	
	
}
