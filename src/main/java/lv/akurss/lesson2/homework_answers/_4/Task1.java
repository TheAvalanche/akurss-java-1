package lv.akurss.lesson2.homework_answers._4;

public class Task1 {

	public static void main(String[] args) {
		int a = square(2);
		int b = cube(2);
		System.out.println(a); //4
		System.out.println(b); //8
	}

	static int square(int x) {
		return x * x;
	}
	
	static int cube(int x) {
		return x * x * x;
	}
}
