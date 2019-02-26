package com.datastructure.linkedlist;

public interface List<T extends Comparable<T> > {
	
	
	public void insert(T data);
	public void delete(T data);
	public void traverseList();
	public int size();
	public Node<T> middleNode();
	public void reverseTheList(List<T> givenList);
}
