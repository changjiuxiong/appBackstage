package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.JdbcUtil;
import model.PathPoint;
import dao.PathPointDao;

public class PathPointDaoImpl implements PathPointDao{

	public boolean addPathPoint(PathPoint pathPoint) {
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("insert into pathPoint values(?,?,?)");
			pst.setString(1, pathPoint.getPathId());
			pst.setInt(2, pathPoint.getIndex());
			pst.setString(3, pathPoint.getPointId());
			pst.executeUpdate();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
