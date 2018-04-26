package service;

import model.Friend;

public interface FriendService {
	public boolean isFriend(String id1, String id2);

	public Boolean deleteFriend(Friend friend);
}
