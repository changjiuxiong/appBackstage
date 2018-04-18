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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}

}
