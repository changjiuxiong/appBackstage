package service;

import java.util.List;

import model.Group;

public interface GroupService {
	public List<Group> SelectGroupsById(String id);
}
