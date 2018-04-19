package serviceImpl;

import java.util.List;

import dao.ChatRecordDao;
import daoImpl.ChatRecordDaoImpl;
import model.ChatRecord;
import service.ChatRecordService;

public class ChatRecordServiceImpl implements ChatRecordService{

	public void insert(ChatRecord chatRecord) {
		ChatRecordDao chatRecordDao = new ChatRecordDaoImpl();
		chatRecordDao.insert(chatRecord);
	}

	public int getMessageNum(String senderId, String receiverId) {
		ChatRecordDao chatRecordDao = new ChatRecordDaoImpl();
		return chatRecordDao.getMessageNum(senderId,receiverId);
	}

	public List<ChatRecord> getNewMsg(String senderId, String receiverId,int curMessageNum) {
		ChatRecordDao chatRecordDao = new ChatRecordDaoImpl();
		return chatRecordDao.getNewMsg(senderId,receiverId,curMessageNum);
	}

}
