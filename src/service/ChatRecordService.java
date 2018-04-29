package service;

import java.util.List;

import model.ChatRecord;


public interface ChatRecordService {
	public void insert(ChatRecord chatRecord);

	public int getMessageNum(String senderId, String receiverId);

	public List<ChatRecord> getNewMsg(String senderId, String receiverId,int curMessageNum);

	public List<ChatRecord> getLastMsgByTwoId(String id1, String id2);
}
