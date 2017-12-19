package lv.akurss.lesson1.lecture.types;

public class Main {
	public static void main(String[] args) {
		
		byte a = 120;
		System.out.println(a); //120
		short b = 32234;
		System.out.println(b); //32234
		int c = 65234234;
		System.out.println(c); //65234234
		c = 123 + 123;
		System.out.println(c); //246
		long d = 234523535323452L;
		System.out.println(d); //234523535323452
		char e = 65;
		System.out.println(e); //A
		char f = 'A';
		System.out.println(f); //A
		
		System.out.println("=====================");
		
		float g = 2.3f;
		System.out.println(g); //2.3
		double h = 2.323;
		System.out.println(h); //2.323

		System.out.println("=====================");

		System.out.printf("Float Max: %f\n", Float.MAX_VALUE);
		System.out.printf("Float Min: %f\n", Float.MIN_VALUE);
		
		System.out.printf("Double Max: %f\n", Double.MAX_VALUE);
		System.out.printf("Double Min: %f\n", Double.MIN_VALUE);

		System.out.println("=====================");
		
		boolean i = true;
		System.out.println(i); //true
		boolean j = false;
		System.out.println(j); //false
		int k = 2 + 2;
		boolean l = k == 4;
		System.out.println(l); //true
		boolean m = k == 3;
		System.out.println(m); //false
		boolean n = k < 4;
		System.out.println(n); //false
		boolean o = k <= 4;
		System.out.println(o); //true

		System.out.println("=====================");
		
		String p = "Hello, world";
		System.out.println(p); //Hello, world
		String r = p + ". Let's burn it!";
		System.out.println(r); //Hello, world. Let's burn it!

		System.out.println("=====================");
	}
}
