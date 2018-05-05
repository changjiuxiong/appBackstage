package dao;

import java.util.List;

import model.Path;
import model.Point;

public interface PathDao {

	boolean addPath(Path path);

	List<Path> getPathListByUserId(String userId);

	List<Point> getStartAndEndById(String id);

}
