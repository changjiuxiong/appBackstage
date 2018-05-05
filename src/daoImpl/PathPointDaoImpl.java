package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JdbcUtil;
import model.Path;
import model.PathPoint;
import model.Point;
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

	public List<PathPoint> getPathPointsByPathId(String pathId) {
		List<PathPoint> pathPoints = new ArrayList<PathPoint>();
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("select * from pathPoint where pathId = ? order by `index`");
			pst.setString(1, pathId);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				pathPoints.add(new PathPoint(rs.getString(1), rs.getInt(2), rs.getString(3)));
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return pathPoints;
	}

	public List<Point> getPointsByPathId(String pathId) {
		List<Point> points = new ArrayList<Point>();
		return points;
	}

}
