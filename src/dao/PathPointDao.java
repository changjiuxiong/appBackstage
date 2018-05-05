package dao;

import java.util.List;

import model.PathPoint;
import model.Point;

public interface PathPointDao {
	public boolean addPathPoint(PathPoint pathPoint);

	public List<PathPoint> getPathPointsByPathId(String pathId);

	public List<Point> getPointsByPathId(String pathId);
}
