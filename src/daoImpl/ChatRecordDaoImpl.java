package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JdbcUtil;
import model.ChatRecord;
import model.User;
import dao.ChatRecordDao;

public class ChatRecordDaoImpl implements ChatRecordDao{

	public void insert(ChatRecord chatRecord) {
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("insert into chatRecord values(?,?,?,NOW())");
			pst.setString(1, chatRecord.getSenderId()); 
			pst.setString(2, chatRecord.getReceiverId());
			pst.setString(3, chatRecord.getContent()); 
			pst.executeUpdate();
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public int getMessageNum(String senderId, String receiverId) {
		int messageNum = 0;
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("select count(*) from chatRecord where senderId = ? and receiverId = ?");
			pst.setString(1, senderId); 
			pst.setString(2, receiverId);
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

	public List<ChatRecord> getNewMsg(String senderId, String receiverId,int curMessageNum) {
		List<ChatRecord> chatRecords = new ArrayList<ChatRecord>();
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("select * from chatRecord where senderId = ? and receiverId = ? LIMIT ?,99999");
			pst.setString(1, senderId); 
			pst.setString(2, receiverId);
			pst.setInt(3, curMessageNum);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				chatRecords.add(new ChatRecord(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return chatRecords;
	}

	public List<ChatRecord> getLastMsgByTwoId(String id1, String id2) {
		List<ChatRecord> chatRecords = new ArrayList<ChatRecord>();
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("select * from chatrecord where (senderId = ? and receiverId = ?) or (receiverId = ? and senderId = ?) ORDER BY dateTime DESC LIMIT 20");
			pst.setString(1, id1); 
			pst.setString(2, id2);
			pst.setString(3, id1); 
			pst.setString(4, id2);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				chatRecords.add(new ChatRecord(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return chatRecords;
	}

}
