package lv.akurss.lesson9.lecture.comparable;

public class ComparablePerson implements Comparable<ComparablePerson> {
	
	private String name;
	private String surname;

	public ComparablePerson(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				'}';
	}

	@Override
	public int compareTo(ComparablePerson o) {
		return this.name.compareTo(o.getName());
	}
}
