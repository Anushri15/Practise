package com.designpattern.facade;

public class AquaGroup implements Group {

	private String instructorName;
	private String venue;

	public AquaGroup(String instructorName, String venue) {
		this.instructorName = instructorName;
		this.venue = venue;
	}

	@Override
	public String getDetails() {
		return instructorName + " - " + venue;
	}

}
