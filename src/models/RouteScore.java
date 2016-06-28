package models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class RouteScore implements Serializable {
	@Id @GeneratedValue
	private Long id;
	private int score;
	@ManyToOne(optional=false)
	private Route route;
	@ManyToOne(optional = false)
	private User user;

	public RouteScore(int score, Route route, User user) {
		super();
		this.score = score;
		this.route = route;
		this.user = user;
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
