package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JdbcUtil;
import model.GroupChatRecord;
import dao.GroupChatRecordDao;

public class GroupChatRecordDaoImpl implements GroupChatRecordDao{

	public GroupChatRecord getLastMsgById(String id) {
		GroupChatRecord groupChatRecord = null;
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("select * from groupchatrecord where groupId = ? ORDER BY dateTime DESC LIMIT 1");
			pst.setString(1, id); 

			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				groupChatRecord = new GroupChatRecord(rs.getString(1), rs.getString(1), rs.getString(3), rs.getString(4), rs.getString(5));
			}
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return groupChatRecord;
	}

}
