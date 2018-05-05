package service;

import java.util.List;

import model.PathPoint;
import model.Point;

public interface PathPointService {

	List<PathPoint> getPathPointsByPathId(String pathId);

	List<Point> getPointsByPathId(String pathId);

}
