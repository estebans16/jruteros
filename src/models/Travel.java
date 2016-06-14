package models;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Travel implements Serializable {
	@Id @GeneratedValue
	private Long id;
	@OneToMany(mappedBy="point")
	private ArrayList<Apoint> pointsList;

	public Long getId() {
		return id;
	}

	public ArrayList<Apoint> getPointsList() {
		return pointsList;
	}

	public void setPointsList(ArrayList<Apoint> pointsList) {
		this.pointsList = pointsList;
	}
	
	public boolean addPoint(Apoint point){
		return this.pointsList.add(point);
	}
	
	public boolean removePoint(Apoint point){
		return this.pointsList.remove(point);
	}

	public Travel(ArrayList<Apoint> pointsList) {
		super();
		this.pointsList = pointsList;
	}
	
	public Travel() {
		super();
	}

}
