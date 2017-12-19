package lv.akurss.lesson3.lecture.ex5_access_modifiers.ext;

import lv.akurss.lesson3.lecture.ex5_access_modifiers.Person;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person();
		//p1.defaultField = ""; // DOESN'T WORK, access is default - visible only from the same package
		p1.publicField = "";
		//p1.protectedField = ""; // DOESN'T WORK, access is protected - visible only from the same package and subclasses
		//p1.privateField = ""; // DOESN'T WORK, access is private
		
		//p1.defaultMethod(); // DOESN'T WORK, access is default - visible only from the same package
		p1.publicMethod();
		//p1.protectedMethod(); // DOESN'T WORK, access is protected - visible only from the same package and subclasses
		//p1.privateMethod(); // DOESN'T WORK, access is private

	}
}
