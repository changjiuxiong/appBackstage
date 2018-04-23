package dao;

import java.util.List;

import model.Group;

public interface GroupDao {
	public List<Group> SelectGroupsById(String id);
	public List<Group> SelectGroupChatListById(String id);
}
