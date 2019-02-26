package com.designpattern.facade;

public class AqGrp2 implements Group {

	private String instructorName;
	private String venue;
	public AqGrp2(String instructorName, String venue) {
		this.instructorName = instructorName;
		this.venue = venue;
	}
	
	
	@Override
	public String getDetails() {
		return instructorName+" - "+venue;
	}
}
