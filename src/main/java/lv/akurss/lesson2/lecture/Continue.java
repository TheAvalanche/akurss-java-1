package lv.akurss.lesson2.lecture;

public class Continue {
	public static void main(String[] args) {
		for (int a = 0; a <= 10; a++) {
			if (a % 2 == 0) {
				continue;
			}
			System.out.println("Value of a is: " + a);
		}
	}
}
