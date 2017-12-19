package lv.akurss.lesson6.lecture.casting_use_case;

public class Main {

	public static void main(String[] args) {
		double a = 2.0;
		int b = (int) a;
		System.out.println(b);
		
		int c = 2;
		double d = (double) c;
		System.out.println(d);
		
		Car car = new Car(250, 4);
		Bus bus = new Bus(140, 100);
		
		printTransportData(car);
		printTransportData(bus);
		
	}
	
	private static void printTransportData(Transport transport) {
		if (transport instanceof Car) {
			Car car = (Car) transport;
			System.out.println("Car wheels " + car.getWheels());
		} else if (transport instanceof Bus) {
			Bus bus = (Bus) transport;
			System.out.println("Bus sitCount " + bus.getSitCount());
		}
	}
	
}
