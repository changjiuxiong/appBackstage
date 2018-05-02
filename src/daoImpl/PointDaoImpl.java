package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.JdbcUtil;
import model.Point;
import dao.PointDao;

public class PointDaoImpl implements PointDao {

	public boolean addPoint(Point point) {
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("insert into point values(?,?,?)");
			pst.setString(1, point.getId()); 
			pst.setDouble(2, point.getLng()); 
			pst.setDouble(3, point.getLat()); 
			pst.executeUpdate();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
