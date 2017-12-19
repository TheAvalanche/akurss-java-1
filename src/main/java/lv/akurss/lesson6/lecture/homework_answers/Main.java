package lv.akurss.lesson6.lecture.homework_answers;

public class Main {

	public static void main(String[] args) {
		Bus bus = new Bus(50);
		Trolleybus trolleybus = new Trolleybus(100);
		Train train = new Train(100, 4);
		
		RoutePlanner routePlanner = new KengaragsRoutePlanner("Riga", "Salaspils");
		routePlanner.addToRoute(bus);
		routePlanner.addToRoute(trolleybus);
		routePlanner.addToRoute(train);
		routePlanner.calculateTotal();
	}
}