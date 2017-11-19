package lv.akurss.lesson11.lecture.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodExample {

	public static void main(String[] args) {
		print(123);
		print(123L);
		print(true);
		print("Text");

		System.out.println(max("B", "Z"));
		System.out.println(max(56, 12));
		System.out.println(max(22.0, 56.5));
		System.out.println(max(true, false));
		
		List<String> strings = createList("A", "B", "C");
		List<Integer> integers = createList(12, 22, 38, 1, 18);

		System.out.println(strings);
		System.out.println(integers);
	}
	
	public static <E> void print(E obj) {
		System.out.println(obj);
	}
	
	public static <E extends Comparable<E>> E max(E one, E two) {
		int i = one.compareTo(two);
		if (i < 0) {
			return two;
		}
		return one;
	}
	
	public static <E> List<E> createList(E... values) {
		List<E> list = new ArrayList<>();
		for (E val : values) {
			list.add(val);
		}
		return list;
	}
	
}
