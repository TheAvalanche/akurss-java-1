package lv.akurss.lesson6.lecture._5_practice2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Person> secretNames = new HashMap<>();
		
		secretNames.put("pantera", new Person("Bill", "White", 35));
		secretNames.put("bear", new Person("Ben", "Black", 35));
		secretNames.put("deer", new Person("Bob", "Gray", 35));
		secretNames.put("eagle", new Person("Billy", "Red", 35));

		System.out.println("Size: " + secretNames.size());
		
		Person p = secretNames.get("eagle");
		System.out.println("Eagle real name: " + p.getName());
		
		secretNames.remove("deer");

		System.out.println("Size: " + secretNames.size());
		
		for (String s : secretNames.keySet()) {
			System.out.println(s);
		}
		
		for (Person per : secretNames.values()) {
			System.out.println(per.getSurname());
		}
		
		for (Map.Entry<String, Person> entry : secretNames.entrySet()) {
			String key = entry.getKey();
			Person value = entry.getValue();
			System.out.println("Key: " + key + " Value: " + value.getName());
		}
		
	}
	
}
