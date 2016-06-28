package models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Table;

@Entity
public class Photo implements Serializable {
	
	@Id @GeneratedValue
	private Long id;
	private String name;
	private String path;
	@ManyToOne(optional=false)
	@JoinColumn(name="route_id")
	private Route route;
	public Long getId(){
		return id;
	}
	
	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Photo(String name, String path) {
		super();
		this.name = name;
		this.path = path;
	}
	
	public Photo() {
		super();
	}
}
