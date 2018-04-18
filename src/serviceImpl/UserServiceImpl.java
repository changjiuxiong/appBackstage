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
		List<User> users=new ArrayList<User>();
		users.add(new User("同学1号","李长久1","男",23,"img/head/001.png","开启","密码保密"));
		users.add(new User("同学2号","李长久2","男",23,"img/head/002.png","开启","密码保密"));
		users.add(new User("同学3号","李长久3","男",23,"img/head/003.png","开启","密码保密"));
		users.add(new User("同学4号","李长久4","男",23,"img/head/004.png","开启","密码保密"));
		users.add(new User("同学5号","李长久5","男",23,"img/head/005.png","开启","密码保密"));
		return users;
	}

	public User getUserByIdServlet(String id) {
		// TODO Auto-generated method stub
		return new User("同学2号","李长久2","男",23,"img/head/002.png","开启","密码保密");
	}

	public List<User> selectChatListById(String id) {
		List<User> users=new ArrayList<User>();
		users.add(new User("同学6号","李长久1","男",23,"img/head/001.png","开启","密码保密"));
		users.add(new User("同学7号","李长久2","男",23,"img/head/002.png","开启","密码保密"));
		users.add(new User("同学8号","李长久3","男",23,"img/head/003.png","开启","密码保密"));
		users.add(new User("同学9号","李长久4","男",23,"img/head/004.png","开启","密码保密"));
		users.add(new User("同学10号","李长久5","男",23,"img/head/005.png","开启","密码保密"));
		return users;
	}

	public Boolean insertUser(User user) {
		// TODO Auto-generated method stub
		return true;
	}

	public Boolean login(String id, String password) {
		// TODO Auto-generated method stub
		return true;
	}

}
