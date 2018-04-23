package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JdbcUtil;

import model.Group;
import model.User;
import dao.GroupDao;

public class GroupDaoImpl implements GroupDao{

	public List<Group> SelectGroupsById(String id) {
		List<Group> groups = new ArrayList<Group>();
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("select * from chatGroup where id in (select id from groupMember where userId = ?)");
			pst.setString(1, id);
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()){
				groups.add(new Group(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return groups;
	}

	public List<Group> SelectGroupChatListById(String id) {
		List<Group> groups = new ArrayList<Group>();
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("select * from chatGroup where id in (select id from groupMember where id in (select groupId from groupChatRecord) and userId = ?)");
			pst.setString(1, id);
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()){
				groups.add(new Group(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return groups;
	}

}
