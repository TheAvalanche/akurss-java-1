package lv.akurss.lesson2.homework_answers._4;

public class Task4 {

	public static void main(String[] args) {
		double a = sum(2.5, 0.2);
		System.out.println(a); //2.7
		double b = subtract(5.4, 2.7);
		System.out.println(b); //2.7
		double c = divide(9.3, 3.1);
		System.out.println(c); //3.0
		double d = multiply(1.2, 2.0);
		System.out.println(d); //2.4
	}

	static double sum(double a, double b) {
		return a + b;
	}

	static double subtract(double a, double b) {
		return a - b;
	}

	static double divide(double a, double b) {
		return a / b;
	}

	static double multiply(double a, double b) {
		return a * b;
	}


}
