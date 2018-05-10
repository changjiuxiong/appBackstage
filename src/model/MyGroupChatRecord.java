package model;

public class MyGroupChatRecord {
	private String groupId;
	private String senderId;
	private String senderName;
	private String senderHeadImg;
	private String receiverId;
	private String content;
	private String dateTime;
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getSenderId() {
		return senderId;
	}
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getSenderHeadImg() {
		return senderHeadImg;
	}
	public void setSenderHeadImg(String senderHeadImg) {
		this.senderHeadImg = senderHeadImg;
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
	public MyGroupChatRecord(String groupId, String senderId,
			String senderName, String senderHeadImg, String receiverId,
			String content, String dateTime) {
		this.groupId = groupId;
		this.senderId = senderId;
		this.senderName = senderName;
		this.senderHeadImg = senderHeadImg;
		this.receiverId = receiverId;
		this.content = content;
		this.dateTime = dateTime;
	}
}
