package dao;

import java.util.List;

import model.User;

public interface UserDao {

	public List<User> selectAll();
	public Boolean insertUser(User user);
	public Boolean login(String id, String password);
	public List<User> selectFriendsById(String id);
	public List<User> selectChatListById(String id);
	public List<User> selectUsersByIdOrName(String idOrName);
	public Boolean updateUser(User user);
	public List<User> selectUsersByGroupId(String groupId);
	public User getUserById(String id);
	public boolean updateUserHeadImg(User user);
}

