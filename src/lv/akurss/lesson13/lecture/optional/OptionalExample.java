package lv.akurss.lesson13.lecture.optional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalExample {

	static List<Developer> devs = new ArrayList<>();
	
	static {
		devs.add(new Developer("alvin", new BigDecimal("1000"), 30));
		devs.add(new Developer("jason", new BigDecimal("1500"), 32));
		devs.add(new Developer("iris", new BigDecimal("4000"), 9));
		devs.add(new Developer("john", new BigDecimal("350"), 25));
	}

	public static void main(String[] args) {
		Optional<Developer> d = find("john");

		d.ifPresent(dev -> System.out.println(dev.getSalary()));
		
		BigDecimal salary = d.map(dev -> dev.getSalary()).orElse(new BigDecimal("0"));

		System.out.println(salary);
	}
	
	private static Optional<Developer> find(String name) {
		List<Developer> dev = devs.stream()
				.filter(d -> d.getName().equals(name))
				.limit(1)
				.collect(Collectors.toList());
		if (dev.isEmpty()) {
			return Optional.empty();
		} else {
			return Optional.of(dev.get(0));
		}
	}
	
}
