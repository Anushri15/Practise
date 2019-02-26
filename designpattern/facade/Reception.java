package com.designpattern.facade;

import java.util.HashMap;
import java.util.Map;

public class Reception {
	
	
	Map<String, Group> lookupMap = new HashMap<>();
	public String getGroup(String groupId) {
		if(lookupMap.containsKey(groupId))
		return lookupMap.get(groupId).getDetails();
		else 
			return lookupMap.get("AQUA").getDetails();
		
	}
	
	public void addNewGroup(String groupId, Group group) {
		lookupMap.put(groupId, group);
	}
	
}
