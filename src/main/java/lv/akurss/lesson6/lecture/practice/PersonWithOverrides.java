package lv.akurss.lesson6.lecture.practice;

public class PersonWithOverrides extends Person {
	
	public PersonWithOverrides(String name, String surname) {
		super(name, surname);
	}

	@Override
	public String toString() {
		return "Person " + getName() + " " + getSurname();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		
		return other.getName().equals(this.getName()) 
				&& other.getSurname().equals(this.getSurname());
	}
}
