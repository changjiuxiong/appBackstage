package service;

import java.util.List;

import model.User;

public interface UserService {
	
	public List<User> selectAll();

	public List<User> selectFriendsById(String id);

	public User getUserByIdServlet(String id);

	public List<User> selectChatListById(String id);

	public Boolean insertUser(User user);

	public Boolean login(String id, String password);
}
