package dao;

import java.util.List;

import model.FriendApply;
import model.User;

public interface FriendApplyDao {
	Boolean addFriendApply(FriendApply friendApply);

	List<User> getFriendApplyById(String id);

	Boolean updateFriendApply(FriendApply friendApply);

}
