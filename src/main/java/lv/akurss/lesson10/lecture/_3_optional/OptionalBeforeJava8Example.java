package lv.akurss.lesson10.lecture._3_optional;

import lv.akurss.lesson10.lecture._2_streams.Developer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OptionalBeforeJava8Example {

	public static void main(String[] args) {
		List<Developer> devs = new ArrayList<>();

		devs.add(new Developer("John", 900, 25));
		devs.add(new Developer("Subramanian", 1200, 25));
		devs.add(new Developer("Ravli", 1150, 35));
		devs.add(new Developer("Kumar", 610, 40));
		devs.add(new Developer("Samuel", 1050, 38));
		
		Developer dev = findByName(devs, "Anil");

		if (dev != null) {
			System.out.println(dev.getSalary());
		}
	}
	
	private static Developer findByName(List<Developer> devs, String name) {
		List<Developer> filtered = devs.stream()
				.filter(d -> d.getName().equals(name))
				.limit(1)
				.collect(Collectors.toList());
		
		if (filtered.isEmpty()) {
			return null;
		} else {
			return filtered.get(0);
		}
		
	}
	
}
