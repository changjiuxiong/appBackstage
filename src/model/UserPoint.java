package model;

public class UserPoint {
	private String userId;
	private double lng;
	private double lat;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public UserPoint(String userId, double lng, double lat) {
		this.userId = userId;
		this.lng = lng;
		this.lat = lat;
	}
}
