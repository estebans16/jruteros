package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import DAOJPA.UserDAOJPA;

@Entity
public class User implements Serializable {
	@Id @GeneratedValue
	private Long id;
	private String userName;
	private String password;
	private int dni;
	private String name;
	private String lastName;
	private String address;
	private Date birthdate;
	private String sex;
	private String email;
	private String roll;
	private boolean active;
	@OneToMany(mappedBy="owner", cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	private List<Route> routes;
	@OneToMany(mappedBy="user", cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	private List<RouteScore> routeScores;
	@OneToMany( cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	private List<Route> traveledRoutes;
	
	public User(String userName, int dni, String name, String lastName,
			String address, Date birthdate, String sex, String email,
			String roll, boolean active, ArrayList<Route> routesList,
			ArrayList<RouteScore> routeScoreList,
			ArrayList<Route> traveledRoutes) {
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
		this.routes = routesList;
		this.routeScores = routeScoreList;
		this.traveledRoutes = traveledRoutes;
	}
	
	public User(String userName, String password, int dni, String name, String lastName,
			String address, Date birthdate, String sex, String email,
			String roll, boolean active, ArrayList<Route> routesList,
			ArrayList<RouteScore> routeScoreList,
			ArrayList<Route> traveledRoutes) {
		super();
		this.userName = userName;
		this.password = password;
		this.dni = dni;
		this.name = name;
		this.lastName = lastName;
		this.address = address;
		this.birthdate = birthdate;
		this.sex = sex;
		this.email = email;
		this.roll = roll;
		this.active = active;
		this.routes = routesList;
		this.routeScores = routeScoreList;
		this.traveledRoutes = traveledRoutes;
	}
	
	public User(){
		super();
	}
	
	public Long getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<RouteScore> getRouteScores() {
		return routeScores;
	}
	public void setRouteScores(List<RouteScore> routeScores) {
		this.routeScores = routeScores;
	}
	public List<Route> getTraveledRoutes() {
		return traveledRoutes;
	}
	public void setTraveledRoutes(List<Route> traveledRoutes) {
		this.traveledRoutes = traveledRoutes;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<RouteScore> getRouteScoreList() {
		return routeScores;
	}
	public void setRouteScoreList(List<RouteScore> list) {
		this.routeScores = list;
	}
	public List<Route> getTraveledRouteList() {
		return traveledRoutes;
	}
	public void setTraveledRouteList(List<Route> list) {
		this.traveledRoutes = list;
	}
	public List<Route> getRoutes() {
		return routes;
	}
	public void setRoutes(List<Route> list) {
		this.routes = list;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
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
	
/*	public String signup(){
		UserDAOJPA daoUser = new UserDAOJPA();
		if (!daoUser.existePorUserName(this.userName)) {
			this.roll="User";
			this.active=true;
			int randomNum = 1000 + (int)(Math.random() * 9999);
			this.password=String.valueOf(randomNum);
			daoUser.persistir(this);
			return "success";
		} else {
			return "failure";
		}
	}*/

}
