package dao;

import java.util.List;

import model.GroupMember;

public interface GroupMemberDao {
	public boolean addUsersToGroup(String groupId, List<String> userIds);

	public Boolean quitGroup(GroupMember groupMember);
}
