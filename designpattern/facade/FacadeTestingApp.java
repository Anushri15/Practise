package com.designpattern.facade;

/* FACTORY DESIGN PATTERN : Factory design pattern is mainly used in the complex application when you have to interation with 
 * the client and client will have access to the interface to access the system. It comes under the Structural Design Pattern
 * The underlying concept is that the complexity of the system is hidden and access is provided to the interface to communicate with
 * the system. Small example to test it. Lets consider a scenerio where we have a health consultancy. The costumer goes to the reception
 * and will ask a particular group class schedule. The customer does not bother about how many types of group classes are there
 * He just asks for his interest. Ex : Customer is interested in aqua group classes. He gives input as Aqua group class.
 * Now the receptionist's responsibility to get the desired details to the customer. Customer is not aware of the complexities involoved in
 * getting the information  */
public class FacadeTestingApp {

	public static void main(String[] args) {
		
		
		Reception receptionist = groupLookupTable();
		 System.out.println(receptionist.getGroup("YOGA"));
		 System.out.println(receptionist.getGroup("FITNESS"));
		 System.out.println(receptionist.getGroup("AQUA"));
		 System.out.println(receptionist.getGroup("A"));


		
	}

	private static Reception groupLookupTable() {
		Reception receptionist = new Reception();
		
		  receptionist.addNewGroup("FITNESS", new FittnessGroup("Lola","Near Gym"));
		  receptionist.addNewGroup("YOGA", new YogaGroup("Judy","Room A"));
		  receptionist.addNewGroup("AQUA", new AquaGroup("Natalia","Pool"));
		return receptionist;
	}

}
