package dao;

import model.Friend;

public interface FriendDao {
	public boolean addFriend(Friend friend);

	public boolean deleteFriend(Friend friend);

	public boolean isFriend(String id1, String id2);
}
