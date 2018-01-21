package lv.akurss.lesson2.homework_answers._3;

public class Task2 {

	public static void main(String[] args) {
		int[] a = {28, 87, 9, 76, 12, 32, 53, 88, 3, 15};

		//i
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("=================");
		
		//ii
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}

		System.out.println("=================");

		//iii
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Max: " + max);

		//iv
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Min: " + min);
	}


}
