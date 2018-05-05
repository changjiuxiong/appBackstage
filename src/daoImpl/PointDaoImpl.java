package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JdbcUtil;
import model.Point;
import model.User;
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

	public Point getPointById(String id) {
		Point point = null;
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("select * from point where id = ?");
			pst.setString(1, id);
			ResultSet rs=pst.executeQuery();
			
			if(rs.next()){
				point = new Point(rs.getString(1),rs.getDouble(2),rs.getDouble(3));
			}
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return point;
	}

}
