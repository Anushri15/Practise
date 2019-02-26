package com.datastructure.linkedlist;

public class LinkedList<T extends Comparable<T>> implements List<T> {

	private int listSize;
	private Node<T> rootNode;

	@Override
	public void insert(T data) {
		++this.listSize;
		if (this.rootNode == null) {
			this.rootNode = new Node<>(data);
		} else {
			insertAtTheBeginingOfNode(rootNode, data);
		}

	}

	private void insertAtTheBeginingOfNode(Node<T> rootNode, T data) {

		Node<T> newNode = new Node<>(data);
		newNode.setNextNode(rootNode);
		this.rootNode = newNode;

	}

	@Override
	public void delete(T data) {
		if (this.rootNode == null)
			return;
		--this.listSize;
		if (rootNode.getData().compareTo(data) == 0)
			rootNode = rootNode.getNextNode();
		else
			deleteTheItem(rootNode, rootNode.getNextNode(), data);

	}

	private void deleteTheItem(Node<T> root, Node<T> nextNode, T data) {

		while (nextNode != null) {
			if (nextNode.getData().compareTo(data) == 0) {
				root.setNextNode(nextNode.getNextNode());

				nextNode = null;
			} else {
				root = root.getNextNode();
				nextNode = nextNode.getNextNode();
				/*
				 * root =nextNode; nextNode=nextNode.getNextNode();
				 */
			}
		}

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.listSize;
	}

	@Override
	public void traverseList() {

		Node<T> currentNode = this.rootNode;
		while (currentNode != null) {
			System.out.print(currentNode + " ,");
			currentNode = currentNode.getNextNode();
		}
	}

	/*
	 * How to find the middle element in the given linked list. There are 2
	 * solutions for this. Solution 1: first iterate through the linked list and get
	 * the count of linked List and then iterate again n check for node which
	 * matches count/2. Her iteration is done twice . First solution has linear
	 * complexity but the second solution we iterate only once.
	 * 
	 * Solution 2: Point 2 nodes one slower node and other faster node. When the
	 * slower node reaches the middle of list the faster nodes next to next node
	 * will be end of the list Here the complexity is O(N)
	 */

	@Override
	public Node<T> middleNode() {
		Node<T> slowerNode = this.rootNode;
		Node<T> fasterNode = this.rootNode;

		while (fasterNode.getNextNode() != null && fasterNode.getNextNode().getNextNode() != null) {
			slowerNode = slowerNode.getNextNode();
			fasterNode = fasterNode.getNextNode().getNextNode();
		}
		return slowerNode;

	}

	/*
	 * Construct an in-place algorithm to reverse a linked list! There are 2
	 * possible solutions Solution : Iterate through the list and when you reach the
	 * end of the list start storing them another newly created list. This is both
	 * time and memory consuming. Solution 2 : User pointers
	 */
	
	/*
	 * Here the previousNode is initially Pointing to null and nextNode also is pointing to null.
	 * 
	 * 1. while the currentNode is pointing to the rootNode. if the rootNode is not empty,
	 * we enter the while loop and point nextNode to the node after the root node.
	 * Now the currentNode is pointing to the first element and nextNode is pointing to 
	 * second element. As we are reversing we need to make the first node point to null and
	 * not the second element. So we update the pointer of first element to the pointer 
	 * of previousNode ie null.Then let the previousNode points to currentNode and currentNode
	 * points to nextNode.
	 * 
	 * 2. In the second Iteration if the currentNode not equals to null, we increment the
	 * pointer of nextNode, currentNode pointer reference will point to previousNode and previousNode
	 * now points to currentNode and currentNode points to nextNode. This loop and increments continue till 
	 * currentNode is not null.
	 * */

	@Override
	public void reverseTheList(List<T> givenList) {
		Node<T> currentNode = this.rootNode;
		Node<T> previousNode = null;
		Node<T> nextNode = null;

		while (currentNode != null) {
			nextNode = currentNode.getNextNode();
			currentNode.setNextNode(previousNode);
			previousNode = currentNode;
			currentNode = nextNode;
		}
		this.rootNode = previousNode;

	}

}
