package lv.akurss.lesson8.lecture._1_wrappers;

public class UnboxingExample {


	public static void main(String[] args) {
/*		Integer x = new Integer(15);
		Integer y = new Integer(20);
		
		int result = sum(x.intValue(), y.intValue());*/

		Integer x = 15;
		Integer y = 20;
		
		int result = sum(x, y);
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	
}
