package lv.akurss.lesson4.homework_answers._1;

public class KengaragsRoutePlanner implements RoutePlanner {
	
	private String from;
	private String to;
	private int totalPassengers = 0;

	public KengaragsRoutePlanner(String from, String to) {
		this.from = from;
		this.to = to;
	}

	@Override
	public void addToRoute(PublicTransport publicTransport) {
		totalPassengers = totalPassengers + (int) (publicTransport.getPassengerCount() * 1.2);
	}
	
	@Override
	public void calculateTotal() {
		System.out.println("Route from " + from + " to " + to + " can take up to " + totalPassengers + " passengers");
	}
	
	
}
