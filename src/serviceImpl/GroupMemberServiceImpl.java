package serviceImpl;

import java.util.List;

import dao.GroupMemberDao;
import daoImpl.GroupMemberDaoImpl;

import service.GroupMemberService;

public class GroupMemberServiceImpl implements GroupMemberService{

	public boolean addUsersToGroup(String groupId, List<String> userIds) {
		GroupMemberDao groupMemberDaoImpl =new GroupMemberDaoImpl();
		return groupMemberDaoImpl.addUsersToGroup(groupId, userIds);
	}

}
