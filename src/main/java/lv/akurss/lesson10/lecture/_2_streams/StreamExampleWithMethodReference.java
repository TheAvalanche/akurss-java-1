package lv.akurss.lesson10.lecture._2_streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleWithMethodReference {

	public static void main(String[] args) {

		List<Developer> devs = new ArrayList<>();
		
		devs.add(new Developer("John", 900, 25));
		devs.add(new Developer("Subramanian", 1200, 25));
		devs.add(new Developer("Ravli", 1150, 35));
		devs.add(new Developer("Kumar", 610, 40));
		devs.add(new Developer("Samuel", 1050, 38));
		
		//sort by salary
		//filter > 1000
		//get their names
		
		devs.stream()
				.sorted(Comparator.comparing(Developer::getSalary).reversed())
				.filter(d -> d.getSalary() > 1000)
				.map(Developer::getName)
				.forEach(System.out::println);
		
		//get new list of developers salaries
		List<Integer> salaries = devs.stream().map(Developer::getSalary).collect(Collectors.toList());
		
		salaries.forEach(System.out::println);

		devs.stream()
				.map(Developer::getSalary)
				.forEach(System.out::println);
		
	}
	
}
