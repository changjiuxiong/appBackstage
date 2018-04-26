package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

	public boolean insert(GroupChatRecord groupChatRecord) {
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("insert into groupChatRecord values(?,?,?,?,NOW())");
			pst.setString(1, groupChatRecord.getGroupId()); 
			pst.setString(2, groupChatRecord.getSenderId()); 
			pst.setString(3, groupChatRecord.getReceiverId());
			pst.setString(4, groupChatRecord.getContent()); 
			pst.executeUpdate();
			conn.close();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public List<GroupChatRecord> getGroupNewMsg(String groupId, int curMessageNum) {
		List<GroupChatRecord> groupChatRecord = new ArrayList<GroupChatRecord>();
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("select * from groupChatRecord where groupId = ? LIMIT ?,99999");
			pst.setString(1, groupId); 
			pst.setInt(2, curMessageNum);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				groupChatRecord.add(new GroupChatRecord(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
			}
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return groupChatRecord;
	}

	public int getGroupMessageNum(String groupId) {
		int messageNum = 0;
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("select count(*) from groupChatRecord where groupId = ?");
			pst.setString(1, groupId); 
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				messageNum = rs.getInt(1);
			}
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		return messageNum;
	}

}
