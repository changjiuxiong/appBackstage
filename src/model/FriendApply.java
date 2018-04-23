package model;

public class FriendApply {
	private String senderId;
	private String receiverId;
	private String statue;
	public String getSenderId() {
		return senderId;
	}
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}
	public String getReceiverId() {
		return receiverId;
	}
	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}
	public String getStatue() {
		return statue;
	}
	public void setStatue(String statue) {
		this.statue = statue;
	}
	public FriendApply(String senderId, String receiverId, String statue) {
		this.senderId = senderId;
		this.receiverId = receiverId;
		this.statue = statue;
	}
	
	
}
