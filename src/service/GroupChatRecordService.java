package service;

import java.util.List;

import model.GroupChatRecord;

public interface GroupChatRecordService {

	boolean insert(GroupChatRecord groupChatRecord);

	List<GroupChatRecord> getGroupNewMsg(String groupId, int curMessageNum);

	int getGroupMessageNum(String groupId);

	List<GroupChatRecord> getLastGroupMsgById(String groupId);
	
}
