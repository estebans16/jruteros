package models;

import java.util.ArrayList;
import java.util.Date;

public class User {
	
	private String userName;
	private int dni;
	private String name;
	private String lastName;
	private String address;
	private Date birthdate;
	private String sex;
	private String email;
	private String roll;
	private boolean active;
	private ArrayList<Route> routesList;
	
	
	
	public ArrayList<Route> getRoutesList() {
		return routesList;
	}
	public void setRoutesList(ArrayList<Route> routesList) {
		this.routesList = routesList;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

	public User(String userName, int dni, String name, String lastName, String address, Date birthdate, String sex,
			String email, String roll, boolean active, ArrayList<Route> routesList) {
		super();
		this.userName = userName;
		this.dni = dni;
		this.name = name;
		this.lastName = lastName;
		this.address = address;
		this.birthdate = birthdate;
		this.sex = sex;
		this.email = email;
		this.roll = roll;
		this.active = active;
		this.routesList = routesList;
	}
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
