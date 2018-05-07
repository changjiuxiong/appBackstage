package service;

import java.util.List;

import model.User;

public interface UserService {
	
	public List<User> selectAll();

	public List<User> selectFriendsById(String id);

	public User getUserById(String id);

	public List<User> selectChatListById(String id);

	public Boolean insertUser(User user);

	public Boolean login(String id, String password);

	public List<User> selectUsersByIdOrName(String idOrName);

	public Boolean updateUser(User user);

	public List<User> selectUsersByGroupId(String groupId);

	public boolean updateUserHeadImg(User user);
}
