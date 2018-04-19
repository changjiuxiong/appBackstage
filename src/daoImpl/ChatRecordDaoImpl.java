package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

}
