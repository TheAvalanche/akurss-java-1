package lv.akurss.lesson11.lecture.generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardTypeExample {

	public static void main(String[] args) {
		
		List<Number> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(2);
		
		printGenericCollection(numberList); //works
		printGenericWildcardCollection(numberList); //works
		
		List<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		
		//printGenericCollection(integerList); doesn't work
		printGenericWildcardCollection(integerList); //works
	}

	private static void printGenericCollection(List<Number> list) {
		for (Number number : list) {
			System.out.println(number);
		}
	}

	private static void printGenericWildcardCollection(List<? extends Number> list) {
		for (Number number : list) {
			System.out.println(number);
		}
	}
}
