package models;

public class Point {
	private String longuitude;
	private	String latitude;
	
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
	public Point(String longuitude, String latitude) {
		super();
		this.longuitude = longuitude;
		this.latitude = latitude;
	}
}
