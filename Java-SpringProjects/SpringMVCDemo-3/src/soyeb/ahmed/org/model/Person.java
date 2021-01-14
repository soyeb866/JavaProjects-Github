package soyeb.ahmed.org.model;

public class Person {
	private String name;
	private int age;
	private int email;

	
	
	public Person(String name, int age, int email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
	
	public int getEmail() {
		return email;
	}

	public void setEmail(int email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + "]";
	}
	
}
