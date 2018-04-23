package model;

public class Friend {
	private String id;
	private String friendId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFriendId() {
		return friendId;
	}
	public void setFriendId(String friendId) {
		this.friendId = friendId;
	}
	public Friend(String id, String friendId) {
		this.id = id;
		this.friendId = friendId;
	}
	
	
}
