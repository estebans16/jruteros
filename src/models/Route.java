package models;

import java.io.Serializable;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Route implements Serializable {
	@Id @GeneratedValue
	private Long id;
	private String name;
	private String description;
	private boolean isPublic;
	@OneToOne(optional=false, cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	private Travel travel;
	private boolean isCircular;
	private float distance;
	private Difficulty difficulty;
	private String activity;
	private Time time;
	private Date date;
	@OneToMany(mappedBy="route",  cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	private List<Photo> photoList;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User owner;
	@OneToMany
	@JoinColumn(name="route_id")
	private List<RouteScore> routeScores;

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
	
	
	public Route(String name, String description, boolean isPublic, Travel travel, boolean isCircular, float distance,
			Difficulty difficulty, String activity, Time time, Date date, List<Photo> photoList,List<RouteScore> routeScores,
			User owner) {
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
		this.photoList = photoList;
		this.owner = owner;
		this.routeScores = routeScores;
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

	public List<Photo> getPhotoList() {
		return photoList;
	}

	public void setPhotoList(List<Photo> list) {
		this.photoList = list;
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

	public List<Photo> getPhotos() {
		return photoList;
	}

	public void setPhotos(ArrayList<Photo> photos) {
		this.photoList = photos;
	}
	
	

}
