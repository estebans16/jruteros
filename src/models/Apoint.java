package models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Apoint implements Serializable {
	@Id @GeneratedValue
	private Long id;
	private String longuitude;
	private	String latitude;
	@ManyToOne(optional = false)
	@JoinColumn(name="travel_id")
	private Travel travel;
	
	public Travel getTravel() {
		return travel;
	}
	public void setTravel(Travel travel) {
		this.travel = travel;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId(){
		return id;
	}
	public String getLonguitude() {
		return longuitude;
	}
	public void setLonguitude(String longuitude) {
		this.longuitude = longuitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public Apoint(String longuitude, String latitude) {
		super();
		this.longuitude = longuitude;
		this.latitude = latitude;
		this.travel = travel;
	}
	public Apoint() {
		super();
	}
}