package com.designpattern.singleton;

/*Singleton Design Pattern
There are multiple ways to create a design pattern. We need to know which ways suites best for out application.
	
	Most common uses of Singleton Design Pattern : 1. To instantiate Driver class object 2. Logging Mechanism 3. Caching 
	
	
 		Lazy Loading(Initialization) : Where Singleton class object is created on call of the
 		getInstance method. To over come the performance hit with synchronize way of creating, we can create a inner helper class to
 		instantiate the singleton object this class will not be loaded when the SingletonDesignLazyInitializationWithInnerClass class is loaded
 		instead this inner class is loaded when we call the getInstance() method.
	This approach suits best of 1. FileSystem 2. Database connection 
	
	This class demonstrates the first approach :
	
	Whatever way we create our singleton class common rules we have to follow are
		
		1. Private constructor so that the other classes are restricted to instantiate it.
		2. Private static variable of the same class which is assigned the instance of the class
		3. Public static method which returns the instance of the class which is global access point to access the singleton class instance
	
	 
 */

public class SingletonDesignLazyInitializationWithInnerClass {

	// Step 1: private constructor of the class

	private SingletonDesignLazyInitializationWithInnerClass() {

	}

	// Step 2: private variable for the instance of the class.

	//This helper inner class is loaded only when the getInstance() method is called.
	private static class SingletonHelper {

		private static final SingletonDesignLazyInitializationWithInnerClass instance = new SingletonDesignLazyInitializationWithInnerClass();

	}

	// Step 3 : public static method to return the instance of the class.
	public static synchronized SingletonDesignLazyInitializationWithInnerClass getInstance() {

		return SingletonHelper.instance;
	}

}
