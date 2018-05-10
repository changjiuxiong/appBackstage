package serviceImpl;

import java.util.ArrayList;
import java.util.List;

import dao.GroupDao;
import daoImpl.GroupDaoImpl;

import model.Group;
import service.GroupService;

public class GroupServiceImpl implements GroupService{

	public List<Group> SelectGroupsById(String id) {
		GroupDao groupDao = new GroupDaoImpl();
		return groupDao.SelectGroupsById(id);
	}

	public List<Group> selectGroupChatListById(String id) {
		GroupDao groupDao = new GroupDaoImpl();
		return groupDao.SelectGroupChatListById(id);
	}

	public boolean addGroup(Group group) {
		GroupDao groupDao = new GroupDaoImpl();
		return groupDao.addGroup(group);
	}

	public boolean updateGroupHeadImg(Group group) {
		GroupDao groupDao = new GroupDaoImpl();
		return groupDao.updateGroupHeadImg(group);
	}
	
}
