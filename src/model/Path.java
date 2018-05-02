package model;

public class Path {
	private String id;
	private String userId;
	private String dateTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public Path(String id, String userId, String dateTime) {
		this.id = id;
		this.userId = userId;
		this.dateTime = dateTime;
	}
	
	
}
