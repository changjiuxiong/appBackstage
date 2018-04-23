package dao;

import model.GroupChatRecord;

public interface GroupChatRecordDao {
	public GroupChatRecord getLastMsgById(String id);
}
