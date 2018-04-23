package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JdbcUtil;
import model.FriendApply;
import model.User;
import dao.FriendApplyDao;

public class FriendApplyDaoImpl implements FriendApplyDao{

	public Boolean addFriendApply(FriendApply friendApply) {
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("insert into friendApply values(?,?,'待审核')");
			pst.setString(1, friendApply.getSenderId()); 
			pst.setString(2, friendApply.getReceiverId()); 
			pst.executeUpdate();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public List<User> getFriendApplyById(String id) {
		List<User> users=new ArrayList<User>();
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("select * from user where id in (select senderId from friendApply where receiverId = ? and statue = '待审核')");
			pst.setString(1, id); 
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()){
				users.add(new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7)));
			}
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}

	public Boolean updateFriendApply(FriendApply friendApply) {
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("update friendApply set statue = ? where senderId = ? and receiverId = ?");
			pst.setString(1, friendApply.getStatue()); 
			pst.setString(2, friendApply.getSenderId()); 
			pst.setString(3, friendApply.getReceiverId()); 
			pst.executeUpdate();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
