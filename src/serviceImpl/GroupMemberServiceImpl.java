package serviceImpl;

import java.util.List;

import model.GroupMember;

import dao.GroupMemberDao;
import daoImpl.GroupMemberDaoImpl;

import service.GroupMemberService;

public class GroupMemberServiceImpl implements GroupMemberService{

	public boolean addUsersToGroup(String groupId, List<String> userIds) {
		GroupMemberDao groupMemberDaoImpl =new GroupMemberDaoImpl();
		return groupMemberDaoImpl.addUsersToGroup(groupId, userIds);
	}

	public Boolean quitGroup(GroupMember groupMember) {
		GroupMemberDao groupMemberDaoImpl =new GroupMemberDaoImpl();
		return groupMemberDaoImpl.quitGroup(groupMember);
	}

}
