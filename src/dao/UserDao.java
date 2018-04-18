package dao;

import java.util.List;

import model.User;

public interface UserDao {

	public List<User> selectAll();
	public Boolean insertUser(User user);
	public Boolean login(String id, String password);
}

