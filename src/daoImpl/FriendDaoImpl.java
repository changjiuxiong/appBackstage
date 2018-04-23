package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Friend;

import util.JdbcUtil;
import dao.FriendDao;

public class FriendDaoImpl implements FriendDao{
	
	public boolean addFriend(Friend friend) {
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("insert into friend values(?,?)");
			pst.setString(1, friend.getId()); 
			pst.setString(2, friend.getFriendId()); 
			
			pst.executeUpdate();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public Boolean deleteFriend(Friend friend) {
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("delete from friend where (id = ? and friendId = ?) or (friendId = ? and id = ?)");
			pst.setString(1, friend.getId()); 
			pst.setString(2, friend.getFriendId()); 
			pst.setString(3, friend.getId()); 
			pst.setString(4, friend.getFriendId());
			pst.executeUpdate();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
