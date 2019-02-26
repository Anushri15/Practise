package com.datastructure.tree;

public interface Tree<T extends Comparable<T>> {

	public Node<T> getRootNode();
	
	public Node<T> getKSmallestNode(Node<T> node, int k);
	
	public void insert(T data);

	public T delete(T data);

	public T max();

	public T min();

	public void traversal();

}
