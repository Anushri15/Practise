package com.datastructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.mchange.v1.util.ArrayUtils;

public class ArrayPrograms {
	
	
	/*
	 * public int solution(Integer a[]) {
	 * 
	 * 
	 * Set<Integer> set = new HashSet<>(Arrays.asList(a));
	 * 
	 * 
	 * int i = 1;
	 * 
	 * while (set.contains(i)) { i++; } return i; }
	 */
	
	
	public int solution(int A[]) {
		int count = 1;
		
		  Arrays.sort(A);

		 for (int number : A) {
			if(number==count)
				count = count+1;
			else
				break;
		 }
		 return count;
		
		 
	}

}
