package lv.akurss.lesson3.lecture.ex5_access_modifiers;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.defaultField = "";
		p1.publicField = "";
		p1.protectedField = "";
		//p1.privateField = ""; -- DOESN'T WORK, access is private
		
		p1.defaultMethod();
		p1.publicMethod();
		p1.protectedMethod();
		//p1.privateMethod(); -- DOESN'T WORK, access is private

	}
}
