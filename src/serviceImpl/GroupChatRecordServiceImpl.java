package serviceImpl;

import java.util.List;

import dao.GroupChatRecordDao;
import daoImpl.GroupChatRecordDaoImpl;
import model.GroupChatRecord;
import service.GroupChatRecordService;

public class GroupChatRecordServiceImpl implements GroupChatRecordService {

	public boolean insert(GroupChatRecord groupChatRecord) {
		GroupChatRecordDao groupChatRecordDao = new GroupChatRecordDaoImpl();
		return groupChatRecordDao.insert(groupChatRecord);
	}

	public List<GroupChatRecord> getGroupNewMsg(String groupId, int curMessageNum) {
		GroupChatRecordDao groupChatRecordDao = new GroupChatRecordDaoImpl();
		return groupChatRecordDao.getGroupNewMsg(groupId, curMessageNum);
	}

	public int getGroupMessageNum(String groupId) {
		GroupChatRecordDao groupChatRecordDao = new GroupChatRecordDaoImpl();
		return groupChatRecordDao.getGroupMessageNum(groupId);
	}

	public List<GroupChatRecord> getLastGroupMsgById(String groupId) {
		GroupChatRecordDao groupChatRecordDao = new GroupChatRecordDaoImpl();
		return groupChatRecordDao.getLastMsgById(groupId);
	}

}
