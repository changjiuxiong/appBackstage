package service;

import java.util.List;

import model.GroupMember;

public interface GroupMemberService {
	public boolean addUsersToGroup(String groupId, List<String> userIds);

	public Boolean quitGroup(GroupMember groupMember);
}
