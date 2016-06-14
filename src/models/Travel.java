package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Travel implements Serializable {
	@Id @GeneratedValue
	private Long id;
	@OneToMany
	private List<Apoint> pointsList;
	@OneToOne
	private Route route;

	public Long getId() {
		return id;
	}

	public List<Apoint> getPointsList() {
		return pointsList;
	}

	public void setPointsList(List<Apoint> pointsList) {
		this.pointsList = pointsList;
	}
	
	public boolean addPoint(Apoint point){
		return this.pointsList.add(point);
	}
	
	public boolean removePoint(Apoint point){
		return this.pointsList.remove(point);
	}

	public Travel(List<Apoint> pointsList) {
		super();
		this.pointsList = pointsList;
	}
	
	public Travel() {
		super();
	}

}
