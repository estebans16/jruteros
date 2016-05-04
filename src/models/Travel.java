package models;

import java.util.ArrayList;

public class Travel {
	private ArrayList<Point> pointsList;

	public ArrayList<Point> getPointsList() {
		return pointsList;
	}

	public void setPointsList(ArrayList<Point> pointsList) {
		this.pointsList = pointsList;
	}
	
	public boolean addPoint(Point point){
		return this.pointsList.add(point);
	}
	
	public boolean removePoint(Point point){
		return this.pointsList.remove(point);
	}

	public Travel(ArrayList<Point> pointsList) {
		super();
		this.pointsList = pointsList;
	}

}
