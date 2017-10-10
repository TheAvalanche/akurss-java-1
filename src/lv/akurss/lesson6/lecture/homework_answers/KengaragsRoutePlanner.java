package lv.akurss.lesson6.lecture.homework_answers;

public class KengaragsRoutePlanner implements RoutePlanner {

	public static final double DENSITY_INDEX = 1.2;
	private String from;
	private String to;
	private int totalPassengers = 0;

	public KengaragsRoutePlanner(String from, String to) {
		this.from = from;
		this.to = to;
	}

	@Override
	public void addToRoute(PublicTransport publicTransport) {
		System.out.println("Adding " + publicTransport + " to route");
		totalPassengers = totalPassengers + (int) (publicTransport.getPassengerCount() * DENSITY_INDEX);
		
		if (publicTransport instanceof Train) {
			Train train = (Train) publicTransport;
			int passengersPerCarriage = Utils.passengersPerCarriage(train);
			System.out.println("Train holds " + passengersPerCarriage + " in every carriage");
		}
	}
	
	@Override
	public void calculateTotal() {
		System.out.println("Route from " + from + " to " + to + " can take up to " + totalPassengers + " passengers");
	}
	
	
}
