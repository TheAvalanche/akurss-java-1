package lv.akurss.lesson3.homework_answers._3;

public class Main {

	public static void main(String[] args) {
		Bus bus = new Bus(50);
		Trolleybus trolleybus = new Trolleybus(100);
		Train train = new Train(100, 4);
		
		RoutePlanner routePlanner = new RoutePlanner("Riga", "Salaspils");
		routePlanner.addToRoute(bus);
		routePlanner.addToRoute(trolleybus);
		routePlanner.addToRoute(train);
		routePlanner.calculateTotal();
	}
}