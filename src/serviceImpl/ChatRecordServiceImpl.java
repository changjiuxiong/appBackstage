package serviceImpl;

import dao.ChatRecordDao;
import daoImpl.ChatRecordDaoImpl;
import model.ChatRecord;
import service.ChatRecordService;

public class ChatRecordServiceImpl implements ChatRecordService{

	public void insert(ChatRecord chatRecord) {
		ChatRecordDao chatRecordDao = new ChatRecordDaoImpl();
		chatRecordDao.insert(chatRecord);
	}

}
