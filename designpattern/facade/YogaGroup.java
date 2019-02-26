package com.designpattern.facade;

public class YogaGroup implements Group {

	private String instructorName;
	private String venue;

	public YogaGroup(String instructorName, String venue) {
		super();
		this.instructorName = instructorName;
		this.venue = venue;
	}

	@Override
	public String getDetails() {
		
		return instructorName+" - "+venue;
	}
	
}
