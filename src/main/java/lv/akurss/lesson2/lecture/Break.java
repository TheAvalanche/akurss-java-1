package lv.akurss.lesson2.lecture;

public class Break {
	public static void main(String[] args) {
		for (int a = 0; a <= 10; a++) {
			if (a == 6) {
				break;
			}
			System.out.println("Value of a is: " + a);
		}
	}
}
