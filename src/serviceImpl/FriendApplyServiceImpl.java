package serviceImpl;

import java.util.List;

import dao.FriendApplyDao;
import dao.FriendDao;
import daoImpl.FriendApplyDaoImpl;
import daoImpl.FriendDaoImpl;
import model.Friend;
import model.FriendApply;
import model.User;
import service.FriendApplyService;

public class FriendApplyServiceImpl implements FriendApplyService{

	public Boolean addFriendApply(FriendApply friendApply) {
		FriendApplyDao friendApplyDao = new FriendApplyDaoImpl();
		return friendApplyDao.addFriendApply(friendApply);
	}

	public List<User> getFriendApplyById(String id) {
		FriendApplyDao friendApplyDao = new FriendApplyDaoImpl();
		return friendApplyDao.getFriendApplyById(id);
	}

	public Boolean updateFriendApply(FriendApply friendApply) {
		FriendApplyDao friendApplyDao = new FriendApplyDaoImpl();
		FriendDao friendDao = new FriendDaoImpl();
		if(friendApplyDao.updateFriendApply(friendApply)){
			if("同意".equals(friendApply.getStatue())){
				return friendDao.addFriend(new Friend(friendApply.getSenderId(),friendApply.getReceiverId()));
			}else if("拒绝".equals(friendApply.getStatue())){
				return friendDao.deleteFriend(new Friend(friendApply.getSenderId(),friendApply.getReceiverId()));
			}
		}else {
			return false;
		}
		return false;
	}

}
