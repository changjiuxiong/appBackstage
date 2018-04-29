package dao;

import java.util.List;

import model.ChatRecord;

public interface ChatRecordDao {
	public void insert(ChatRecord chatRecord);

	public int getMessageNum(String senderId, String receiverId);

	public List<ChatRecord> getNewMsg(String senderId, String receiverId,int curMessageNum);
	
	public List<ChatRecord> getLastMsgByTwoId(String Id1, String id2);
}
