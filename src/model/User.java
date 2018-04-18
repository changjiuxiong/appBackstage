package model;

public class User {
	private String id;
	private String name;
	private String sex;
	private int age;
	private String headImgUrl;
	private String isShareLocation;
	private String password;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHeadImgUrl() {
		return headImgUrl;
	}
	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}
	public String getIsShareLocation() {
		return isShareLocation;
	}
	public void setIsShareLocation(String isShareLocation) {
		this.isShareLocation = isShareLocation;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String id, String name, String sex, int age, String headImgUrl,
			String isShareLocation, String password) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.headImgUrl = headImgUrl;
		this.isShareLocation = isShareLocation;
		this.password = password;
	}
	
}
