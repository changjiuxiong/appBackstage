package model;

public class Point {
	private String id;
	private double lng;
	private double lat;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public Point(String id, double lng, double lat) {
		this.id = id;
		this.lng = lng;
		this.lat = lat;
	}

	
	
}
