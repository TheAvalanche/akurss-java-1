package lv.akurss.lesson8.lecture._3_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodExample {


	public static void main(String[] args) {
		List<String> strings = createList("A", "B", "C", "D");
		List<String> strings2 = createList("John", "Peter", "Sarah");
		
		List<Integer> ints = createList(1, 2, 3, 4, 5);
		
		List<Double> doubles = createList(1.0, 2.0, 3.0);

		System.out.println(max("A", "C"));
		System.out.println(max(1, 101));
		System.out.println(max(15.6, 22.1));
	}
	
	private static <T> List<T> createList(T... arr) {
		List<T> list = new ArrayList<>();
		for (T s : arr) {
			list.add(s);
		}
		return list;		
	}
	
	private static <E extends Comparable> E max(E one, E two) {
		int i = one.compareTo(two);
		if (i > 0) {
			return one;
		} else {
			return two;
		}
	}
	
	
	
}
