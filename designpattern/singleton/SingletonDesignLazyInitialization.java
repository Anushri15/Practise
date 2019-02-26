package com.designpattern.singleton;

/*Singleton Design Pattern
There are multiple ways to create a design pattern. We need to know which ways suites best for out application.
	
	Most common uses of Singleton Design Pattern : 1. To instantiate Driver class object 2. Logging Mechanism 3. Caching 
	
	
 		Lazy Loading(Initilization) : Where Singleton class object is created on call of the
 		getInstance method.In this case object creation happens in the method. So only when the method is called we create an instance if the
 		instance is not created earlier  i.e..(instance==null)create new otherwise use existing instance.
 		
 		 Disadvantage :Not thread safe
	This approach suits best of 1. FileSystem 2. Database connection 
	
	This class demonstrates the first approach :
	
	Whatever way we create our singleton class common rules we have to follow are
		
		1. Private constructor so that the other classes are restricted to instantiate it.
		2. Private static variable of the same class which is assigned the instance of the class
		3. Public static method which returns the instance of the class which is global access point to access the singleton class instance
	
	 
 */

public class SingletonDesignLazyInitialization {

	// Step 1: private constructor of the class

	private SingletonDesignLazyInitialization() {

	}

	// Step 2: private variable for the instance of the class.
	private static SingletonDesignLazyInitialization instance;

	//Step 3 : public static method to return the instance of the class. 
	public static SingletonDesignLazyInitialization getInstance() {
		if (instance == null) {
			instance = new SingletonDesignLazyInitialization();
		}

		return instance;
	}

}
