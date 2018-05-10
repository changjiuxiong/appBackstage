package service;

import java.util.List;

import model.UserPoint;

public interface UserPointService {

	List<UserPoint> getUserPointsByGroupId(String groupId);

	boolean upDateUserPoint(UserPoint userPoint);

}
