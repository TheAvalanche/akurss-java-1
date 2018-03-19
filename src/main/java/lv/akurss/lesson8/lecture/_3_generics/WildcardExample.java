package lv.akurss.lesson8.lecture._3_generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {

	public static void main(String[] args) {
		List<Number> numberList = new ArrayList<>();
		numberList.add(1L);
		numberList.add(10);
		numberList.add(15.8);
		numberList.add(new Short((short) 1));
		
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(15);
		intList.add(20);
		
		acceptNumber(new Long(10L));
		acceptNumber(new Integer(10));
		acceptNumber(new Double(1.0));
		acceptNumberList(numberList);
		
		//acceptNumberList(intList); doesn't work
		acceptAnyNumberList(numberList); 
		acceptAnyNumberList(intList); //works
		
		acceptInteger(new Integer(10));
		acceptIntegerList(intList);
	}
	
	public static void acceptNumber(Number n) {
		System.out.println(n);
	}
	
	private static void acceptNumberList(List<Number> list) {
		System.out.println(list);
	}
	
	private static void acceptAnyNumberList(List<? extends Number> list) {
		System.out.println(list);
	}

	public static void acceptInteger(Integer n) {
		System.out.println(n);
	}

	private static void acceptIntegerList(List<Integer> list) {
		System.out.println(list);
	}
	
	
	
	
}
