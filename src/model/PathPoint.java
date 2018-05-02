package model;

public class PathPoint {
	private String pathId;
	private int index;
	private String pointId;
	public String getPathId() {
		return pathId;
	}
	public void setPathId(String pathId) {
		this.pathId = pathId;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getPointId() {
		return pointId;
	}
	public void setPointId(String pointId) {
		this.pointId = pointId;
	}
	public PathPoint(String pathId, int index, String pointId) {
		this.pathId = pathId;
		this.index = index;
		this.pointId = pointId;
	}
	
	
}
