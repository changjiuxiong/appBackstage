package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.JdbcUtil;
import model.Path;
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

}
