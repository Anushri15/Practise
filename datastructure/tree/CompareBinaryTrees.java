package com.datastructure.tree;

/*Write an efficient algorithm thats able to compare two binary search trees.
The method returns true if the trees are identical (same topology with same 
values in the nodes) otherwise it returns false.*/

public class CompareBinaryTrees<T extends Comparable<T>> {

	public boolean compareTwoBinaryTrees(Node<T> node1, Node<T> node2) {

		if (node1 == null || node2 == null)
			return node1 == node2;
		if (node1.getData().compareTo(node2.getData()) != 0)
			return false;
		else
			return compareTwoBinaryTrees(node1.getLeftChild(), node2.getLeftChild())
					&& compareTwoBinaryTrees(node1.getRightChild(), node2.getRightChild());

	}

}
