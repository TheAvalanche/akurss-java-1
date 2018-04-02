package lv.akurss.lesson10.lecture._3_optional;

import lv.akurss.lesson10.lecture._2_streams.Developer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalJava8Example {

	public static void main(String[] args) {
		List<Developer> devs = new ArrayList<>();

		devs.add(new Developer("John", 900, 25));
		devs.add(new Developer("Subramanian", 1200, 25));
		devs.add(new Developer("Ravli", 1150, 35));
		devs.add(new Developer("Kumar", 610, 40));
		devs.add(new Developer("Samuel", 1050, 38));
		
		Optional<Developer> optionalDev = findByName(devs, "Anil");

		optionalDev.ifPresent(dev -> System.out.println(dev.getSalary()));
		
		Integer salary = optionalDev.map(Developer::getSalary).orElse(0);
		System.out.println(salary);
	}
	
	private static Optional<Developer> findByName(List<Developer> devs, String name) {
		return devs.stream()
				.filter(d -> d.getName().equals(name))
				.findFirst();		
	}
	
}
