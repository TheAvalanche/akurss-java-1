package lv.akurss.lesson8.lecture.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Person> map = new HashMap<>();
		
		map.put("test0", new Person("Test0", "Test0"));
		map.put("test1", new Person("Test1", "Test1"));
		map.put("test2", new Person("Test2", "Test2"));
		map.put("test3", new Person("Test3", "Test3"));
		map.put("test4", new Person("Test4", "Test4"));

		for (String s : map.keySet()) {
			System.out.println(s);
		}

		for (Person person : map.values()) {
			System.out.println(person.getName() + " " + person.getSurname());
		}


		for (Map.Entry<String, Person> stringPersonEntry : map.entrySet()) {
			String key = stringPersonEntry.getKey();
			Person value = stringPersonEntry.getValue();
			System.out.println(key + ": " + value.getName() + " " +  value.getSurname());
		}

		System.out.println("Size: " + map.size());
		
		Person p = map.get("test0");
		System.out.println(p.getName() + " " + p.getSurname());
		
		map.remove("test0");

		System.out.println("Size: " + map.size());
		
		Person p2 = map.get("test0");
		System.out.println(p2);

	}
	
}
