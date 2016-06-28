package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Travel implements Serializable {
	@Id @GeneratedValue
	private Long id;
	@OneToMany(cascade={CascadeType.PERSIST,CascadeType.REMOVE}, mappedBy="travel")
	private List<Apoint> points;

	public Long getId() {
		return id;
	}

	public List<Apoint> getPointsList() {
		return points;
	}

	public void setPointsList(List<Apoint> pointsList) {
		this.points = pointsList;
	}
	
	public boolean addPoint(Apoint point){
		return this.points.add(point);
	}
	
	public boolean removePoint(Apoint point){
		return this.points.remove(point);
	}

	public Travel(List<Apoint> pointsList) {
		super();
		this.points = pointsList;
	}
	
	public Travel() {
		super();
	}

}
