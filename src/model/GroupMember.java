package model;

public class GroupMember {
	private String id;
	private String userId;
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
	public GroupMember(String id, String userId) {
		super();
		this.id = id;
		this.userId = userId;
	}
	
	
}
