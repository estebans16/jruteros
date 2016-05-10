package models;

public class Photo {
	private String name;
	private String path;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Photo(String name, String path) {
		super();
		this.name = name;
		this.path = path;
	}
}
