package dao;

import java.util.List;

public interface GroupMemberDao {
	public boolean addUsersToGroup(String groupId, List<String> userIds);
}
