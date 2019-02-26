package com.datastructure.tree;

import com.datastructure.ArrayPrograms;

public class App {
	public static void main(String[] args) {
		/*
		 * Tree<Integer> bt = new BinaryTree<>(); bt.insert(32); bt.insert(10);
		 * bt.insert(10); bt.insert(15); bt.insert(19); bt.insert(23); bt.traversal();
		 * System.out.println(bt.delete(32));
		 * 
		 * System.out.println("Max Numu " + bt.max()); System.out.println("Min Numu " +
		 * bt.min());
		 */
		
		/*
		 * Tree<Integer> tree1 = new BinaryTree<>(); tree1.insert(6); tree1.insert(2);
		 * tree1.insert(8); tree1.insert(4); tree1.insert(5); tree1.insert(9);
		 * tree1.traversal();
		 * 
		 * Tree<Integer> tree2 = new BinaryTree<>(); tree2.insert(1); tree2.insert(2);
		 * tree2.insert(8); tree2.insert(4); tree2.insert(5); tree2.insert(9);
		 * tree2.traversal();
		 * 
		 * CompareBinaryTrees compare = new CompareBinaryTrees();
		 * System.out.println(compare.compareTwoBinaryTrees(tree1.getRootNode(),
		 * tree2.getRootNode()));
		 */
		/*
		 * Integer i = Integer.valueOf(10); Integer j = Integer.valueOf(10); Integer i1
		 * = new Integer(10); Integer j1 = new Integer(10);
		 * 
		 * System.out.println("i.equals(j)---->"+i.equals(j));
		 * System.out.println("i==j---->"+(i==j)); //
		 * System.out.println("i1.equals(j1)---->"+i1.equals(j1)); //
		 * System.out.println("i1==j1)---->"+(i1==j1));
		 * 
		 * 
		 * String s1 = "10"; String s2 = "10";
		 * 
		 * System.out.println(s1 == s2);
		 */
		
		
		
		ArrayPrograms arrays = new ArrayPrograms();
		int[] a = {1, 3, 6, 4, 1, 2};
		
		int i = arrays.solution(a);
		System.out.println("smallest ele" + i);
		
		
	}
	
	
}
