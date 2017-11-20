package lv.akurss.lesson11.lecture.wrappers;

public class WrapperExample {

	public static void main(String[] args) {
		int a = Integer.parseInt("20");
		Integer aWrapper = new Integer(a);
		System.out.println(a);
		System.out.println(aWrapper);
		System.out.println(aWrapper.compareTo(30));

		double b = Double.parseDouble("20.99");
		Double bWrapper = new Double(b);
		System.out.println(b);
		System.out.println(bWrapper);
		System.out.println(bWrapper.compareTo(30.99));
		
		boolean c = Boolean.parseBoolean("true");
		Boolean cWrapper = new Boolean(c);
		System.out.println(c);
		System.out.println(cWrapper);
		
	}
	
}
