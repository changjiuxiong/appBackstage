package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JdbcUtil;

import model.User;
import model.UserPoint;
import dao.UserPointDao;

public class UserPointDaoImpl implements UserPointDao {

	public List<UserPoint> getUserPointsByGroupId(String groupId) {
		List<UserPoint> userPoints=new ArrayList<UserPoint>();
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("select * from userPoint where userId in (select userId from groupMember where id = ?)");
			pst.setString(1, groupId);
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()){
				userPoints.add(new UserPoint(rs.getString(1),rs.getDouble(2),rs.getDouble(3)));
			}
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userPoints;
	}

	public boolean upDateUserPoint(UserPoint userPoint) {
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("update userPoint set lng = ?, lat = ? where userId = ?");
			pst.setDouble(1, userPoint.getLng());
			pst.setDouble(2, userPoint.getLat()); 
			pst.setString(3, userPoint.getUserId());
			pst.executeUpdate();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean addUserPoint(String userId) {
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("insert into userPoint values(?,0,0)");
			pst.setString(1, userId); 
			
			pst.executeUpdate();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
