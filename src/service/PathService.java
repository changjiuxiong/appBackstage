package service;

import java.util.List;

import model.Path;
import model.Point;

public interface PathService {

	boolean addPath(Path path);

	boolean addPointToPath(String pathId, int index, double lng, double lat);

	List<Path> getPathListByUserId(String userId);

	List<Point> getStartAndEndById(String id);
	
}
