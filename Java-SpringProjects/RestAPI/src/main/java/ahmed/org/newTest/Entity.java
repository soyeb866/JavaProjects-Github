package ahmed.org.newTest;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Entity {
	private String first_name;

	private String last_name;
	
	private int age;
	
	public Entity() {
	}
	
	
	public Entity(String first_name, String last_name, int age) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
	}



	public String getFirst_name() {
		return first_name;
	}




	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}




	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	SubEntity subEnity = new SubEntity();
	
}