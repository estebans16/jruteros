package models;

import java.io.Serializable;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Route implements Serializable {
	@Id @GeneratedValue
	private Long id;
	private String name;
	private String description;
	private boolean isPublic;
	private Travel travel;
	private boolean isCircular;
	private float distance;
	private Difficulty difficulty;
	private String activity;
	private Time time;
	private Date date;
	private ArrayList<Photo> photoList;
	@OneToOne
	private User owner;

	public Route(String name, String description, boolean isPublic,
			Travel travel, boolean isCircular, float distance, Difficulty difficulty,
			String activity, Time time, Date date, ArrayList<Photo> photos) {
		super();
		this.name = name;
		this.description = description;
		this.isPublic = isPublic;
		this.travel = travel;
		this.isCircular = isCircular;
		this.distance = distance;
		this.difficulty = difficulty;
		this.activity = activity;
		this.time = time;
		this.date = date;
		this.photoList = photos;
	}
	
	public Route(){
		super();
	}
	
	public Long getId(){
		return id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public ArrayList<Photo> getPhotoList() {
		return photoList;
	}

	public void setPhotoList(ArrayList<Photo> photoList) {
		this.photoList = photoList;
	}

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	public boolean isCircular() {
		return isCircular;
	}

	public void setCircular(boolean isCircular) {
		this.isCircular = isCircular;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ArrayList<Photo> getPhotos() {
		return photoList;
	}

	public void setPhotos(ArrayList<Photo> photos) {
		this.photoList = photos;
	}
	
	

}
