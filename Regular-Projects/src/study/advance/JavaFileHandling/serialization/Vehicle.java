package study.advance.JavaFileHandling.serialization;

import java.io.Serializable;

public class Vehicle implements Serializable{

	private static final long serialVersionUID = 8918508829469616840L;
	
	
	private String name;
	private int id;
	public Vehicle(String name, int id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", id=" + id + "]";
	}
	
	
}
