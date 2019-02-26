package com.designpattern.facade;

public class FittnessGroup implements Group {

	private String instructorName;
	private String venue;

	public FittnessGroup(String instructorName, String venue) {
		this.instructorName = instructorName;
		this.venue = venue;
	}

	@Override
	public String getDetails() {

		return instructorName + " - " + venue;
	}

}
