package model;

public class Group {
	private String id;
	private String name;
	private String masterId;
	private String headImgUrl;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMasterId() {
		return masterId;
	}
	public void setMasterId(String masterId) {
		this.masterId = masterId;
	}
	public String getHeadImgUrl() {
		return headImgUrl;
	}
	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}
	public Group(String id, String name, String masterId, String headImgUrl) {
		super();
		this.id = id;
		this.name = name;
		this.masterId = masterId;
		this.headImgUrl = headImgUrl;
	}
	
	
}
