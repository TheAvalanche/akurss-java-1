package lv.akurss.lesson6.lecture.object_use_case;

public class MainExt {

	public static void main(String[] args) {
		CarExt car1 = new CarExt("Volvo", 240);
		CarExt car2 = new CarExt("Volvo", 240);

		System.out.println(car1 instanceof CarExt);
		System.out.println(car1 instanceof Object);
		System.out.println(car1.equals(car1));
		System.out.println(car1.equals(car2));
		System.out.println(car1.toString());
		System.out.println(car1);
		System.out.println(car1.hashCode());
	}
}
