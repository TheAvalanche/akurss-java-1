package lv.akurss.lesson2.homework_answers._4;

public class Task3 {

	public static void main(String[] args) {
		int a = sum(2, 3);
		System.out.println(a); //5
		int b = subtract(8, 5);
		System.out.println(b); //3
		int c = divide(4, 2);
		System.out.println(c); //2
		int d = multiply(2, 3);
		System.out.println(d); //6
	}

	static int sum(int a, int b) {
		return a + b;
	}

	static int subtract(int a, int b) {
		return a - b;
	}

	static int divide(int a, int b) {
		return a / b;
	}

	static int multiply(int a, int b) {
		return a * b;
	}


}
