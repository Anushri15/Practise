package com.datastructure;

/*Duplicates in an array problem overview
The problem is that we want to find duplicates in a T[]
one-dimensional array of integers in O(N) running time where the integer values 
are smaller than the length of the array!*/

/*Solution : 
	
	1. We can use the brute-force approach(comparing each element with rest of 
	the elements) where every element is compared with other elements in the list.Here the
	complexity is O(N2) running time.
	2. Travering the given array and adding it into the Hashtableas values, if unable
	to add the elements then it means they are duplicate. Not in place algorithm
	3.using absolute values : with this approach we can achieve O(N) running the alogrith
*/
public class DuplicateArrayProblem {

	public void solveDulpicateArray(int array[]) {

		for (int i = 0; i < array.length; i++) {
			
			if(array[Math.abs(array[i])]>0) {
				array[Math.abs(array[i])] = -(array[Math.abs(array[i])]);
			}
			else {
				System.out.println("Duplicate number");
			}
		}

	}

}
