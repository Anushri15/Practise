package com.datastructure.queue;

public class QueueApp {
	public static void main(String[] args) {

		/*
		 * This is for the LinkedList implemetation using Custom Queue Queue<String>
		 * queues = new Queue<>(); queues.enqueue("A"); queues.enqueue("B");
		 * queues.enqueue("C"); queues.enqueue("D"); queues.enqueue("E");
		 * System.out.println(queues.dequeue()); System.out.println(queues.dequeue());
		 * System.out.println(queues.dequeue()); System.out.println(queues.dequeue());
		 * System.out.println(queues.dequeue());
		 */

		/*
		 * 
		 * This is for the LinkedList implemetation using Custom Queue
		 * java.util.Queue<String> listNames = new LinkedList<>(); listNames.add("A");
		 * listNames.add("B"); listNames.add("C"); listNames.add("D"); for(String s:
		 * listNames) { System.out.println(s); } //System.out.println("first element " +
		 * listNames.element());
		 */
		
		StackWithQueue<String> myQueue = new StackWithQueue<>();
		myQueue.enqueue("A");
		myQueue.enqueue("B");
		myQueue.enqueue("C");
		myQueue.enqueue("D");
		myQueue.enqueue("E");
		myQueue.enqueue("F");
		
		System.out.println(myQueue.recurringDequeue());
		System.out.println(myQueue.recurringDequeue());
		System.out.println(myQueue.recurringDequeue());

		
	}
	

}
