package models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TraveledRoute implements Serializable {
	@Id @GeneratedValue
	private Long id;
	private Route route;
	
	public Long getId() {
		return id;
	}

	public TraveledRoute(Route route) {
		super();
		this.route = route;
	}
	public TraveledRoute() {
		super();
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}
	
	

}
