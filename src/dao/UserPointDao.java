package dao;

import java.util.List;

import model.UserPoint;

public interface UserPointDao {

	List<UserPoint> getUserPointsByGroupId(String groupId);

	boolean upDateUserPoint(UserPoint userPoint);

	boolean addUserPoint(String id);

}
