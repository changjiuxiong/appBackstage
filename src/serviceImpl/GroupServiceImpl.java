package serviceImpl;

import java.util.ArrayList;
import java.util.List;

import model.Group;
import service.GroupService;

public class GroupServiceImpl implements GroupService{

	public List<Group> SelectGroupsById(String id) {
		List<Group> groups=new ArrayList<Group>();
		groups.add(new Group("同学群112782","同学群1","同学3号","img/head/001.png"));
		groups.add(new Group("同学群1127822","同学群2","同学3号","img/head/002.png"));
		groups.add(new Group("同学群1137822","同学群3","同学3号","img/head/003.png"));
		groups.add(new Group("同学群1178122","同学群4","同学3号","img/head/004.png"));
		groups.add(new Group("同学群117822","同学群5","同学3号","img/head/005.png"));
		return groups;
	}

	public List<Group> selectGroupChatListById(String id) {
		List<Group> groups=new ArrayList<Group>();
		groups.add(new Group("同学群112782","同学群1","同学3号","img/head/001.png"));
		groups.add(new Group("同学群1127822","同学群2","同学3号","img/head/002.png"));
		groups.add(new Group("同学群1137822","同学群3","同学3号","img/head/003.png"));
		return groups;
	}
	
}
