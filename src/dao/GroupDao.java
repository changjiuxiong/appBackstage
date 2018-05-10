package dao;

import java.util.List;

import model.Group;

public interface GroupDao {
	public List<Group> SelectGroupsById(String id);
	public List<Group> SelectGroupChatListById(String id);
	public boolean addGroup(Group group);
	public boolean updateGroupHeadImg(Group group);
}
