package lv.akurss.lesson2.lecture;

public class Functions {

	public static void main(String[] args) {
		int sum = add(2, 5);
		int sum2 = add(1, 4);
		System.out.println(sum);
		System.out.println(sum2);
	}
	
	static int add(int left, int right) {
		return left + right;
	}
}
