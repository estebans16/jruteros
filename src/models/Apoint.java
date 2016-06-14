package models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Point")
public class Apoint implements Serializable {
	@Id @GeneratedValue
	private Long id;
	private String longuitude;
	private	String latitude;
	@OneToOne
	private Travel travel;
	
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
	}
	public Apoint() {
		super();
	}
}