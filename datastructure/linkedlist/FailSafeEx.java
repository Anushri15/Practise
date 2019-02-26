package com.datastructure.linkedlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*Fail Fast :In this class we are checking on what causes "java.util.ConcurrentModificationException" 
When we try to make structural modification in the list inside the iterator we get the java.util.ConcurrentModificationException.
As the original copy of the collection is used any changes made inside the loop will throw exception. If your use case done not have
any sort of modification while iterating then go for Collections such as ArryList,LinkedList,HashMap

Non Fail Fast: Collection type is cloned. It allows the modification of the structure of the collection like add, delete. Copy of the
original Collection is used & it does not throw exception.

Incase your usecase has data modification during the iteration go for collections such as : ConcurrentHashMap, CopyOnWriteArrayList
NOTE: In this case extra memory is required as you clone the collection. So use it only when its required.
*/

public class FailSafeEx {

	public static void main(String[] args) {

//		List<String> mylist = new LinkedList<>();
//
//		mylist.add("A");
//		mylist.add("B");
//		mylist.add("C");
//		mylist.add("D");
//		try {
//			for (String string : mylist) {
//				if (string.equalsIgnoreCase("A")) {
//					System.out.println("Print my string -->" + string);
//					mylist.remove(string);
//				}
//
//			}
//		} catch (Exception e) {
//			throw new ConcurrentModificationException("You are manipulating data go for Concurrent tyoe of collection");
//		}

		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			if(s.equalsIgnoreCase("A")) {
				it.remove();
			}
		}
		System.out.println(list);
		
		Set<String> set = new HashSet<>(list);
		
		Iterator<String> sit = set.iterator();
		while (sit.hasNext()) {
			String s = sit.next();
			if(s.equalsIgnoreCase("A")) {
				sit.remove();
				
			}
		}
		System.out.println(set);
		/*
		 * List<String> mylistCon = new CopyOnWriteArrayList<>();
		 * 
		 * mylistCon.add("A"); mylistCon.add("B"); mylistCon.add("C");
		 * mylistCon.add("D"); for (String string : mylistCon) {
		 * 
		 * if (string.equalsIgnoreCase("A")) { System.out.println("Print my string -->"
		 * + string); mylistCon.remove(string); }
		 * 
		 * }
		 * 
		 */ }

}
