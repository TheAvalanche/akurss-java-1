package lv.akurss.lesson8.lecture._1_wrappers;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingExample {


	public static void main(String[] args) {

/*		Integer iObj = new Integer(7);
		Double dObj = new Double(7.0);

		List<Integer> list = new ArrayList<>();
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(4));

		for (Integer i : list) {
			System.out.println(i);
		}*/
		
		Integer iObj = 7;
		Double dObj = 7.0;

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		for (Integer i : list) {
			System.out.println(i);
		}
		
	}
	
	
}
