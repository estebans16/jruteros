package models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class RouteScore implements Serializable {
	@Id @GeneratedValue
	private Long id;
	private int score;
	@OneToOne(optional = false)
	private Route route;

	public RouteScore(int score, Route route) {
		super();
		this.score = score;
		this.route = route;
	}
	public RouteScore() {
		super();
	}
	
	public Long getId(){
		return id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}
	
	

}
