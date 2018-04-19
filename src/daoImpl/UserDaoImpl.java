package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.UserDao;
import model.User;
import util.JdbcUtil;

public class UserDaoImpl implements UserDao{


	public List<User> selectAll() {
		List<User> users=new ArrayList<User>();
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("select * from user");
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

	public Boolean insertUser(User user) {
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
			pst.setString(1, user.getId()); 
			pst.setString(2, user.getName()); 
			pst.setString(3, user.getSex()); 
			pst.setInt(4, user.getAge()); 
			pst.setString(5, user.getHeadImgUrl()); 
			pst.setString(6, user.getIsShareLocation()); 
			pst.setString(7, user.getPassword()); 
			pst.executeUpdate();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public Boolean login(String id, String password) {
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("select * from user where id = ? and password = ?");
			pst.setString(1, id); 
			pst.setString(2, password); 
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				conn.close();
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}

}
