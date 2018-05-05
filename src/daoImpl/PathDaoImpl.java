package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JdbcUtil;
import model.GroupChatRecord;
import model.Path;
import model.Point;
import dao.PathDao;

public class PathDaoImpl implements PathDao {

	public boolean addPath(Path path) {
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("insert into path values(?,?,NOW())");
			pst.setString(1, path.getId());
			pst.setString(2, path.getUserId());
			pst.executeUpdate();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public List<Path> getPathListByUserId(String userId) {
		List<Path> paths = new ArrayList<Path>();
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("select * from path where userId = ?");
			pst.setString(1, userId);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				paths.add(new Path(rs.getString(1), rs.getString(2), rs.getString(3)));
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return paths;
	}

	public List<Point> getStartAndEndById(String id) {
		List<Point> points = new ArrayList<Point>();
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement("select * from point where id in (select * from ((select pointId from pathPoint where pathId = ? and `index` = 0) UNION all (select pointId from pathPoint where pathId = ? ORDER BY `index` desc LIMIT 1))t1)");
			pst.setString(1, id);
			pst.setString(2, id);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				points.add(new Point(rs.getString(1), rs.getDouble(2), rs.getDouble(3)));
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return points;
	}

}
