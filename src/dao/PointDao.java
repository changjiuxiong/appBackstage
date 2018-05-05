package dao;

import model.Point;

public interface PointDao {

	boolean addPoint(Point point);

	Point getPointById(String id);

}
