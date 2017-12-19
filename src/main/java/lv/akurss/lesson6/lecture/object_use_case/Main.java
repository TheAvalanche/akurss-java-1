package lv.akurss.lesson6.lecture.object_use_case;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("Volvo", 240);
		Car car2 = new Car("Volvo", 240);

		System.out.println(car1 instanceof Car);
		System.out.println(car1 instanceof Object);
		System.out.println(car1.equals(car1));
		System.out.println(car1.equals(car2));
		System.out.println(car1.toString());
		System.out.println(car1);
		System.out.println(car1.hashCode());
	}
}
