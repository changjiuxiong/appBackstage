package serviceImpl;

import java.util.List;

import dao.UserPointDao;
import daoImpl.UserPointDaoImpl;

import model.UserPoint;
import service.UserPointService;

public class UserPointServiceImpl implements UserPointService {

	public List<UserPoint> getUserPointsByGroupId(String groupId) {
		UserPointDao userPointDao = new UserPointDaoImpl();
		return userPointDao.getUserPointsByGroupId(groupId);
	}

	public boolean upDateUserPoint(UserPoint userPoint) {
		UserPointDao userPointDao = new UserPointDaoImpl();
		return userPointDao.upDateUserPoint(userPoint);
	}

}
