package lv.akurss.lesson5.lecture._6_string;

public class StringPlayground {

	public static void main(String[] args) {
		String a = "test1";
		String b = "test2";
		
		String ab = a + b;
		System.out.println(ab);
		
		String ab2 = a.concat(b);
		System.out.println(ab2);

		System.out.println(ab2.length());

		System.out.println(ab2.charAt(4));
		
		String sub1 = ab2.substring(4, 10);
		System.out.println(ab2);
		System.out.println(sub1);
		
		String delimited = "One,Two,Three,Four";
		String[] parts = delimited.split(",");
		for (String part : parts) {
			System.out.println(part);
		}
		
		String lower = "test";
		String upper = "TEST";
		System.out.println(lower.equals(upper)); // false
		System.out.println(lower.equalsIgnoreCase(upper)); // true

		System.out.println(lower.toUpperCase());
		System.out.println(upper.toLowerCase());

		System.out.println(lower.indexOf("st"));
		System.out.println(lower.indexOf("kl"));
		
		String toBeReplaced = "Hello, world!";
		System.out.println(toBeReplaced.replace("world", "Afrika"));
		
		String toBeTrimmed = "     Test      ";
		System.out.println(toBeTrimmed);
		System.out.println(toBeTrimmed.trim());
		
		double d = 3.114;
		String dv = String.valueOf(d);
		System.out.println(dv.split("\\.")[0]);
		
		
	}
	
}
