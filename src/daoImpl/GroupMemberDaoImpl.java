package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import util.JdbcUtil;

import dao.GroupMemberDao;

public class GroupMemberDaoImpl implements GroupMemberDao{

	public boolean addUsersToGroup(String groupId, List<String> userIds) {
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst = null;
			
			for(int i = 0; i < userIds.size(); i++){
				pst = conn.prepareStatement("insert into groupMember values(?,?)");
				pst.setString(1, groupId); 
				pst.setString(2, userIds.get(i)); 
				pst.executeUpdate();
			}		
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
