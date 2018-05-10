package serviceImpl;

import java.util.ArrayList;
import java.util.List;

import dao.GroupChatRecordDao;
import dao.UserDao;
import daoImpl.GroupChatRecordDaoImpl;
import daoImpl.UserDaoImpl;
import model.GroupChatRecord;
import model.MyGroupChatRecord;
import model.User;
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
	
	public List<MyGroupChatRecord> getGroupNewMyMsg(String groupId, int curMessageNum) {
		List<MyGroupChatRecord> myGroupChatRecords = new ArrayList<MyGroupChatRecord>();
		GroupChatRecordDao groupChatRecordDao = new GroupChatRecordDaoImpl();
		UserDao userDao = new UserDaoImpl();
		List<GroupChatRecord> groupChatRecords = groupChatRecordDao.getGroupNewMsg(groupId, curMessageNum);
		for(int i = 0; i < groupChatRecords.size(); i++){
			User user = userDao.getUserById(groupChatRecords.get(i).getSenderId());
			myGroupChatRecords.add(new MyGroupChatRecord(groupChatRecords.get(i).getGroupId(), groupChatRecords.get(i).getSenderId(), user.getName(), user.getHeadImgUrl(), groupChatRecords.get(i).getReceiverId(), groupChatRecords.get(i).getContent(), groupChatRecords.get(i).getDateTime()));
		}
		return myGroupChatRecords;
	}

	public int getGroupMessageNum(String groupId) {
		GroupChatRecordDao groupChatRecordDao = new GroupChatRecordDaoImpl();
		return groupChatRecordDao.getGroupMessageNum(groupId);
	}

	public List<GroupChatRecord> getLastGroupMsgById(String groupId) {
		GroupChatRecordDao groupChatRecordDao = new GroupChatRecordDaoImpl();
		return groupChatRecordDao.getLastMsgById(groupId);
	}
	
	public List<MyGroupChatRecord> getLastMyGroupMsgById(String groupId) {
		List<MyGroupChatRecord> myGroupChatRecords = new ArrayList<MyGroupChatRecord>();
		GroupChatRecordDao groupChatRecordDao = new GroupChatRecordDaoImpl();
		UserDao userDao = new UserDaoImpl();
		List<GroupChatRecord> groupChatRecords = groupChatRecordDao.getLastMsgById(groupId);
		for(int i = 0; i < groupChatRecords.size(); i++){
			User user = userDao.getUserById(groupChatRecords.get(i).getSenderId());
			myGroupChatRecords.add(new MyGroupChatRecord(groupChatRecords.get(i).getGroupId(), groupChatRecords.get(i).getSenderId(), user.getName(), user.getHeadImgUrl(), groupChatRecords.get(i).getReceiverId(), groupChatRecords.get(i).getContent(), groupChatRecords.get(i).getDateTime()));
		}
		return myGroupChatRecords;
	}

}
