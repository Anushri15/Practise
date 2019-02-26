package com.datastructure.stack;

public class Stack<T extends Comparable<T>> {

	private int length;
	private Node<T> rootNode;

	public void push(T data) {
		++length;
		if (rootNode == null) {
			rootNode = new Node<>(data);

		} else {
			Node<T> oldNode = this.rootNode;
			Node<T> newNode = new Node<>(data);
			newNode.setNextNode(oldNode);
			this.rootNode = newNode;
		}
	}
	
	public int getSize() {
		return this.length;
	}
	
	public T pop() {
		
		--this.length;
		T dataToBePopped=this.rootNode.getData();
		this.rootNode=this.rootNode.getNextNode();
		return dataToBePopped;
	
	}

	/*
	 * private void deleteTheNode(Node<T> rootNode, Node<T> nextNode, T data) {
	 * while(nextNode!=null) { if(nextNode.getData().compareTo(data)==0) {
	 * this.rootNode.setNextNode(nextNode.getNextNode()); nextNode=null; } else
	 * rootNode=nextNode; nextNode=nextNode.getNextNode(); }
	 * 
	 * }
	 */

}
