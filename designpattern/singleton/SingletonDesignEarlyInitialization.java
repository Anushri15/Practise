package com.designpattern.singleton;

/*Singleton Design Pattern
There are multiple ways to create a design pattern. We need to know which ways suites best for out application.
	
	Most common uses of Singleton Design Pattern : 1. To instantiate Driver class object 2. Logging Mechanism 3. Caching 
	
	Different ways of creating Singleton Design Pattern : 1. Eager Loading(Initilization) : Where Singleton class object is created during the 
	loading of the class. Disadvantage : Object is created even though the application may not use it. 
	This approach suits best of 1. FileSystem 2. Database connection 
	
	This class demonstrates the first approach :
	
	Whatever way we create our singleton class common rules we have to follow are
		
		1. Private constructor so that the other classes are restricted to instantiate it.
		2. Private static variable of the same class which is assigned the instance of the class
		3. Public static method which returns the instance of the class which is global access point to access the singleton class instance
	
	 
 */

public class SingletonDesignEarlyInitialization {

	// Step 1: private constructor of the class

	private SingletonDesignEarlyInitialization() {

	}

	// Step 2: private variable for the instance of the class.
	private static SingletonDesignEarlyInitialization instance=new SingletonDesignEarlyInitialization();;

	//Step 3 : public static method to return the instance of the class. 
	public static SingletonDesignEarlyInitialization getSingletonDesignEarlyInitialization() {
		return instance;
	}

}
