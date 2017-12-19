package lv.akurss.lesson2.lecture;

public class LogicalOperators {
	public static void main(String[] args) {
		int a = 5;
		int b = 2;

		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);
		System.out.println("===============");
		System.out.println(a == 5 && b == 2);
		System.out.println(a == 5 && b == 3);
		
		System.out.println("===============");
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);

		System.out.println("===============");
		System.out.println(a == 5 || b == 2);
		System.out.println(a == 5 || b == 3);

		System.out.println("===============");

		System.out.println(!true);
		System.out.println(!false);

		System.out.println("===============");
		System.out.println(!(a != 5));
		System.out.println(!(a == 5));
	}
}
