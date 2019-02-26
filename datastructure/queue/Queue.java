package com.datastructure.queue;

public class Queue<T extends Comparable<T>> {

	private Node<T> first;
	private Node<T> last;
	private int length;

	public boolean isEmpty() {
		if (this.first == null)
			return true;
		else
			return false;
	}

	public int size() {
		return this.length;
	}

	public void enqueue(T data) {

		this.length++;
		Node<T> tempVar = this.last;
		this.last = new Node<T>(data);
		this.last.setNextNode(null);
		if (isEmpty()) {
			this.first = this.last;
		} else
			tempVar.setNextNode(last);

	}

	public T dequeue() {
		this.length--;
		T data = this.first.getData();
		this.first = this.first.getNextNode();
		if (isEmpty()) {
			this.last = null;
		}
		return data;
	}

}
