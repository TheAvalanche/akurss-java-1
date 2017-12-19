package lv.akurss.lesson2.lecture;


public class Functions3 {

	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		printSum(add(a, b));
	}

	static int add(int left, int right) {
		int addition = left + right;
		return addition;
	}

	static void printSum(int numberToPrint) {
		System.out.println(numberToPrint);
	}
}