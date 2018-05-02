package service;

import model.Path;

public interface PathService {

	boolean addPath(Path path);

	boolean addPointToPath(String pathId, int index, double lng, double lat);
	
}
