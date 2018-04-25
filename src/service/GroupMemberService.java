package service;

import java.util.List;

public interface GroupMemberService {
	public boolean addUsersToGroup(String groupId, List<String> userIds);
}
