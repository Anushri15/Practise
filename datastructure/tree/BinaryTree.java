package com.datastructure.tree;

public class BinaryTree<T extends Comparable<T>> implements Tree<T> {

	private Node<T> rootNode;

	@Override
	public Node<T> getRootNode() {
		return this.rootNode;
	}

	@Override
	public void insert(T data) {
		if (this.rootNode == null)
			this.rootNode = new Node<>(data);
		else
			insertNode(data, this.rootNode);

	}

	public void insertNode(T data, Node<T> node) {

		if (data.compareTo(node.getData()) < 0) {
			if (node.getLeftChild() != null)
				insertNode(data, node.getLeftChild());
			else {
				Node<T> newNode = new Node<>(data);
				node.setLeftChild(newNode);
			}
		} else if ((data.compareTo(node.getData()) > 0)) {
			if (node.getRightChild() != null) {
				insertNode(data, node.getRightChild());
			} else {
				Node<T> newNode = new Node<>(data);
				node.setRightChild(newNode);
			}
		}

	}

	@Override
	public T delete(T data) {
		if (this.rootNode != null)

			rootNode = delete(data, rootNode);
		return data;
	}

	public Node<T> delete(T data, Node<T> node) {
		if (node == null)
			return null;

		if (data.compareTo(node.getData()) < 0) {

			node.setLeftChild(delete(data, node.getLeftChild()));

		}
		if (data.compareTo(node.getData()) > 0) {
			node.setRightChild(delete(data, node.getRightChild()));
		} else {
			// We have found the node to be deleted
			// 1. It can either be the leaf node
			if (node.getLeftChild() == null && node.getRightChild() == null) {

				System.out.println("This is the leaf node ");

				return null;
			}
			// 2. node which has one child node
			else if (node.getLeftChild() == null) {

				Node<T> tempNode = node.getRightChild();
				node = null;
				return tempNode;
			} else if (node.getRightChild() == null) {

				Node<T> tempNode = node.getLeftChild();
				node = null;
				return tempNode;
			}

			// 3. node which has both child node
			Node<T> predessor = getPredecessor(node.getLeftChild());
			node.setData(predessor.getData());
			node.setLeftChild(delete(predessor.getData(), node.getLeftChild()));

		}

		return node;
	}

	private Node<T> getPredecessor(Node<T> node) {
		if (node.getRightChild() != null)
			return getPredecessor(node.getRightChild());

		return node;
	}

	@Override
	public T max() {
		if (this.rootNode == null)
			return null;
		if (this.rootNode.getRightChild() == null)
			return this.rootNode.getData();
		else

			return maxNode(this.rootNode.getRightChild());
	}

	private T maxNode(Node<T> rightChild) {
		if (rightChild.getRightChild() != null) {
			return maxNode(rightChild.getRightChild());
		} else

			return rightChild.getData();

	}

	public T max(Node<T> rightChild) {
		if (rightChild.getRightChild() != null)
			max(rightChild.getRightChild());
		return rightChild.getData();

	}

	@Override
	public T min() {
		if (this.rootNode == null)
			return null;
		if (this.rootNode.getLeftChild() == null)
			return this.rootNode.getData();
		else

			return minValue(this.rootNode.getLeftChild());

	}

	private T minValue(Node<T> leftChild) {
		if (leftChild.getLeftChild() != null) {
			minValue(leftChild.getLeftChild());
		}

		return leftChild.getData();

	}

	@Override
	public void traversal() {
		if (this.rootNode == null)
			return;

		inorderTraversal(this.rootNode);

	}

	private Node<T> inorderTraversal(Node<T> node) {
		if (node.getLeftChild() != null)
			inorderTraversal(node.getLeftChild());

		System.out.println(node + "--->");

		if (node.getRightChild() != null)
			inorderTraversal(node.getRightChild());
		return node;

	}

	public int getTreeSize(Node<T> node) {
		if (node == null)
			return 0;
		// recursiverly sums up the left node + the right node
		return getTreeSize(node.getLeftChild()) + getTreeSize(node.getRightChild()) + 1;
	}

	@Override
	public Node<T> getKSmallestNode(Node<T> node, int k) {
		int n = getTreeSize(node.getLeftChild()) + 1;

		if (n == k)
			return node;
		if (n > k)
			return getKSmallestNode(node.getLeftChild(), k);
		else
			return getKSmallestNode(node.getLeftChild(), (n - k));

	}

}
