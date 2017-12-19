package lv.akurss.lesson8.lecture.practice;

import java.util.List;

public class Person {
	
	private String name;
	private String surname;
	private List<Post> posts;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
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
}
