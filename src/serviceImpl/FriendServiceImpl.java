package serviceImpl;

import dao.FriendDao;
import daoImpl.FriendDaoImpl;
import service.FriendService;

public class FriendServiceImpl implements FriendService{

	public boolean isFriend(String id1, String id2) {
		FriendDao friendDao = new FriendDaoImpl();
		return friendDao.isFriend(id1, id2);
	}

}
