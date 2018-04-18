package model;

public class ChatRecord {
	private String senderId;
	private String receiverId;
	private String content;
	private String dateTime;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
	public ChatRecord(String senderId, String receiverId, String content,
			String dateTime) {
		super();
		this.senderId = senderId;
		this.receiverId = receiverId;
		this.content = content;
		this.dateTime = dateTime;
	}
	
	
}
