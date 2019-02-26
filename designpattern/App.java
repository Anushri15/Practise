package com.designpattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.designpattern.singleton.SingletonDesignEarlyInitialization;
import com.designpattern.singleton.SingletonDesignEarlyInitializationWithException;

public class App {

	public static void main(String[] args) {

		
		  SingletonDesignEarlyInitialization instance; instance =
		  SingletonDesignEarlyInitialization.getSingletonDesignEarlyInitialization();
		  
		  System.out.println("The 1st instance -----" + instance);
		  
		  SingletonDesignEarlyInitialization instance1; instance1 =
		  SingletonDesignEarlyInitialization.getSingletonDesignEarlyInitialization();
		  
		  System.out.println("The 2st instance -----" + instance1);
		  
		  SingletonDesignEarlyInitializationWithException instanceWithExc;
		  instanceWithExc = SingletonDesignEarlyInitializationWithException.
		  getSingletonDesignEarlyInitialization(); System.out.
		  println("FIrst instance of SingletonDesignEarlyInitializationWithException" +
		  instanceWithExc);
		  
		  SingletonDesignEarlyInitializationWithException instanceWithExc1;
		  instanceWithExc1 = SingletonDesignEarlyInitializationWithException.
		  getSingletonDesignEarlyInitialization(); System.out.
		  println("FIrst instance of SingletonDesignEarlyInitializationWithException" +
		  instanceWithExc1);
		 
		
		
		
		
	}

}
