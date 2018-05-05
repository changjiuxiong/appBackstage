package serviceImpl;

import java.util.List;

import dao.PathPointDao;
import dao.PointDao;
import daoImpl.PathPointDaoImpl;
import daoImpl.PointDaoImpl;

import model.PathPoint;
import model.Point;
import service.PointService;

public class PointServiceImpl implements PointService {

	public Point getPointById(String id) {
		PointDao pointDaoImpl = new PointDaoImpl();
		return pointDaoImpl.getPointById(id);
	}

}
