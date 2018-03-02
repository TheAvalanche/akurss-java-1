package lv.akurss.lesson6.lecture._5_practice2;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		Set<Tag> tags = new HashSet<>();
		
		tags.add(new Tag("whiteoscar"));
		tags.add(new Tag("metoo"));
		tags.add(new Tag("девочкитакиедевочки"));
		
		for (Tag t : tags) {
			System.out.println(t);
		}
		
	}
	
}
