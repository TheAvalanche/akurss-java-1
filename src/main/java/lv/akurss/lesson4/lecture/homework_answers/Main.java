package lv.akurss.lesson4.lecture.homework_answers;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("Mers", 240);
		Car car2 = new Car("Volvo", 200);
		Car car3 = new Car("BMW", 220);
		
		Car[] cars = {car1, car2, car3};
		
		int indexOfMaxSpeed = 0;
		for (int i = 0; i < cars.length; i++) {
			Car car = cars[i];
			if (car.getMaxSpeed() > cars[indexOfMaxSpeed].getMaxSpeed()) {
				indexOfMaxSpeed = i;
			}
		}

		System.out.println(cars[indexOfMaxSpeed].getName());
		System.out.println(cars[indexOfMaxSpeed].getMaxSpeed());
	}
	
}
