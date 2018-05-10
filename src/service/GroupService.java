package service;

import java.util.List;

import model.Group;

public interface GroupService {
	public List<Group> SelectGroupsById(String id);

	public List<Group> selectGroupChatListById(String id);
	public boolean addGroup(Group group);

	public boolean updateGroupHeadImg(Group group);
}
