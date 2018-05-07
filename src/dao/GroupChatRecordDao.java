package dao;

import java.util.List;

import model.GroupChatRecord;

public interface GroupChatRecordDao {
	public List<GroupChatRecord> getLastMsgById(String id);

	public boolean insert(GroupChatRecord groupChatRecord);

	public List<GroupChatRecord> getGroupNewMsg(String groupId,
			int curMessageNum);

	public int getGroupMessageNum(String groupId);
}
