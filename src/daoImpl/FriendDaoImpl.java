package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Friend;
import model.User;

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

	public boolean isFriend(String id1, String id2) {
		boolean isOk = false;
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("select * from friend where (id = ? and friendId = ?) or (friendId = ? and id = ?)");
			pst.setString(1, id1); 
			pst.setString(2, id2); 
			pst.setString(3, id1); 
			pst.setString(4, id2);
			ResultSet rs=pst.executeQuery();
			
			if(rs.next()){
				isOk = true;
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return isOk;
	}
}
