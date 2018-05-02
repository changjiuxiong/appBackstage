package serviceImpl;

import dao.PathDao;
import dao.PathPointDao;
import dao.PointDao;
import daoImpl.PathDaoImpl;
import daoImpl.PathPointDaoImpl;
import daoImpl.PointDaoImpl;
import model.Path;
import model.PathPoint;
import model.Point;
import service.PathService;
import util.IdUtil;

public class PathServiceImpl implements PathService {

	public boolean addPath(Path path) {
		PathDao pathDao = new PathDaoImpl();
		return pathDao.addPath(path);
	}

	public boolean addPointToPath(String pathId, int index, double lng, double lat) {
		PointDao pointDao = new PointDaoImpl();
		String pointId = IdUtil.getId();
		Point point = new Point(pointId, lng, lat);
		if(pointDao.addPoint(point)){
			PathPoint pathPoint = new PathPoint(pathId, index, pointId);
			PathPointDao pathPointDao = new PathPointDaoImpl();
			if(pathPointDao.addPathPoint(pathPoint)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}

}
