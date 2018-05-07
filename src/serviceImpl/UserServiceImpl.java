package serviceImpl;

import java.util.ArrayList;
import java.util.List;

import service.UserService;

import dao.UserDao;
import daoImpl.UserDaoImpl;

import model.User;

public class UserServiceImpl implements UserService{
	public List<User> selectAll() {
		UserDao userDao =new UserDaoImpl();
		return userDao.selectAll();
	}

	public List<User> selectFriendsById(String id) {
		UserDao userDao =new UserDaoImpl();
		return userDao.selectFriendsById(id);
	}

	public User getUserById(String id) {
		UserDao userDao = new UserDaoImpl();
		return userDao.getUserById(id);
	}

	public List<User> selectChatListById(String id) {
		UserDao userDao =new UserDaoImpl();
		return userDao.selectChatListById(id);
	}

	public Boolean insertUser(User user) {
		UserDao userDao =new UserDaoImpl();
		return userDao.insertUser(user);
	}

	public Boolean login(String id, String password) {
		UserDao userDao =new UserDaoImpl();
		return userDao.login( id, password);
	}

	public List<User> selectUsersByIdOrName(String idOrName) {
		UserDao userDao =new UserDaoImpl();
		return userDao.selectUsersByIdOrName(idOrName);
	}

	public Boolean updateUser(User user) {
		UserDao userDao =new UserDaoImpl();
		return userDao.updateUser(user);
	}

	public List<User> selectUsersByGroupId(String groupId) {
		UserDao userDao =new UserDaoImpl();
		return userDao.selectUsersByGroupId(groupId);
	}

	public boolean updateUserHeadImg(User user) {
		UserDao userDao =new UserDaoImpl();
		return userDao.updateUserHeadImg(user);
	}

}
