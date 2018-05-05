package serviceImpl;

import java.util.ArrayList;
import java.util.List;

import dao.PathPointDao;
import dao.PointDao;
import daoImpl.PathPointDaoImpl;
import daoImpl.PointDaoImpl;

import model.PathPoint;
import model.Point;
import service.PathPointService;

public class PathPointServiceImpl implements PathPointService {

	public List<PathPoint> getPathPointsByPathId(String pathId) {
		PathPointDao pathPointDaoImpl = new PathPointDaoImpl();
		return pathPointDaoImpl.getPathPointsByPathId(pathId);
	}

	public List<Point> getPointsByPathId(String pathId) {
		PathPointDao pathPointDaoImpl = new PathPointDaoImpl();
		List<PathPoint> pathPoints = pathPointDaoImpl.getPathPointsByPathId(pathId);
		if(pathPoints != null){
			List<Point> points = new ArrayList<Point>();
			PointDao pointDao = new PointDaoImpl();
			for(int i = 0; i < pathPoints.size(); i++){
				points.add(pointDao.getPointById(pathPoints.get(i).getPointId()));
			}
			return points;
		}
		return null;
	}

}
