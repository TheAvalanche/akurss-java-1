package lv.akurss.lesson13.lecture.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamExample {
	

	public static void main(String[] args) {

		List<Developer> devs = new ArrayList<>();
		devs.add(new Developer("alvin", new BigDecimal("1000"), 30));
		devs.add(new Developer("jason", new BigDecimal("1500"), 32));
		devs.add(new Developer("iris", new BigDecimal("4000"), 9));
		devs.add(new Developer("john", new BigDecimal("350"), 25));

		//without lambda
		List<Integer> ages = new ArrayList<>();
		for (Developer dev : devs) {
			if (dev.getAge() > 18) {
				ages.add(dev.getAge());
			}
		}
		for (Integer age : ages) {
			System.out.println("Age: " + age);
		}

		//with lambda
		devs.stream()
				.map(d -> d.getAge())
				.filter(age -> age > 18)
				.forEach(age -> System.out.println("Age: " + age));

		//some more complex example
		devs.stream()
				.filter(d -> d.getName().startsWith("j"))
				.sorted(Comparator.comparing(Developer::getSalary))
				.map(Developer::getAge)
				.forEach(System.out::println);

	}


}
