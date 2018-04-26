package serviceImpl;

import model.Friend;
import dao.FriendDao;
import daoImpl.FriendDaoImpl;
import service.FriendService;

public class FriendServiceImpl implements FriendService{

	public boolean isFriend(String id1, String id2) {
		FriendDao friendDao = new FriendDaoImpl();
		return friendDao.isFriend(id1, id2);
	}

	public Boolean deleteFriend(Friend friend) {
		FriendDao friendDao = new FriendDaoImpl();
		return friendDao.deleteFriend(friend);
	}

}
