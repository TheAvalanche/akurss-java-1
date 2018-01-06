package lv.akurss.lesson16.lecture;

public class DigitSum {

	public static void main(String[] args) {
		
		int num = 321;
		
		int sum = 0;
		
		while (num > 0) {
			int temp = num % 10;
			
			sum += temp;
			
			num = num / 10;
			
		}

		System.out.println(sum);
		
	}
	
}
