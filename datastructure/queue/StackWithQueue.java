package com.datastructure.queue;

import java.util.Stack;

//The aim is to design a queue abstract data type with the help of stacks.

public class StackWithQueue<T> {

	private Stack<T> stack;
	private Stack<T> queue;

	public StackWithQueue() {
		this.stack = new Stack<T>();
		this.queue = new Stack<T>();
	}

	public void enqueue(T data) {

		this.stack.push(data);

	}

	public T dequeue() {

		if (this.stack == null && this.queue == null) {
			throw new RuntimeException("This stack is empty nothing to remove from it...");
		} else if (this.queue.isEmpty()) {
			while (!this.stack.isEmpty()) {
				this.queue.push(this.stack.pop());
			}
		}
		return this.queue.pop();
	}

	// Another way to solve this problem is recressive way of calling the dequeue
	// method. Here we will be using only one stack but internally we are using the
	// call stack of the program

	public T recurringDequeue() {

		if (this.stack.size() == 1) {
			return this.stack.pop();
		}

		T item = this.stack.pop();

		T lastItem = recurringDequeue();

		this.stack.push(item);

		return lastItem;
	}
}
