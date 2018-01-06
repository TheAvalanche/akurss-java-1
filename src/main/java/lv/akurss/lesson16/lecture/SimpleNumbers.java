package lv.akurss.lesson16.lecture;

public class SimpleNumbers {


	public static void main(String[] args) {
		
		int n = 100;
		
		for (int i = 2; i <= n; i++) {
			
			boolean flag = false;
			
			for (int k = 2; k < i; k++) {
				if (i % k == 0) {
					flag = true;
					break;
				}
			}
			
			if (!flag) {
				System.out.println("Simple number: " + i);
			}
		}
		
	}
	
	
}
