package lv.akurss.lesson6.lecture.static_use_case;

public class Main {

	public static void main(String[] args) {
		int result = CalcUtils.add(5, 10);
		System.out.println(result);
		
		CalcUtils2 calcUtils2 = new CalcUtils2();
		int result2 = calcUtils2.add(5, 10);
		System.out.println(result2);
	}
	
}
