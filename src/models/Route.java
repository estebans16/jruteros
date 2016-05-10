package models;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Route {
	
	private String name;
	private String description;
	private String privacy;
	private Travel travel;
	private String format;
	private float distance;
	private String difficulty;
	private String activity;
	private Time time;
	private Date date;
	private ArrayList<Photo> photoList;

	public Route(String name, String description, String privacy,
			Travel travel, String format, float distance, String difficulty,
			String activity, Time time, Date date, ArrayList<Photo> photos) {
		super();
		this.name = name;
		this.description = description;
		this.privacy = privacy;
		this.travel = travel;
		this.format = format;
		this.distance = distance;
		this.difficulty = difficulty;
		this.activity = activity;
		this.time = time;
		this.date = date;
		this.photoList = photos;
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

	public String getPrivacy() {
		return privacy;
	}

	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
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
