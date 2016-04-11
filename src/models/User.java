package models;

public class User {
	private String name;
	private String lastName;
	private String roll;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public User(String name, String lastName, String roll) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.roll = roll;
	}


}
