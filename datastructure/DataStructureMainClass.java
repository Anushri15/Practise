package com.datastructure;

/*
 * The problem is that we want to reverse a T[] array in O(N) linear time
 * complexity and we want the algorithm to be in-place as well!
 * 
 * For example: input is [1,2,3,4,5] then the output is [5,4,3,2,1]
 */

class DataStructureMainClass {

	public static void main(String[] args) {

		/*
		 * 1. Different ways of defining an array int values[] = new int[5]; values[0] =
		 * 1; values[0] = 2; values[0] = 3; values[0] = 4; values[0] = 5; second way is
		 * uncommmented below
		 */
		int values[] = new int[] { 6, 7, 8, 9 };
		ReversingGivenArray reverserArray = new ReversingGivenArray();
		reverserArray.inputArray(values);
		// Leaner search algorithm has O(N)complexity -leaner running time
		for (int reverseArray : values) {
			System.out.println(reverseArray);
		}

		// Start point for analog problem -solution

		AnagramProblem analProbInput = new AnagramProblem();
		char subject[] = { 'r', 'e', 's', 't', 'f', 'u', 'l' };
		char anagram[] = { 'f', 'l', 'u', 's', 't', 'e', 'r' };
		boolean result = analProbInput.solveAnalogProblem(subject, anagram);

		if (result) {
			System.out.println("Hey Bingo  " + String.valueOf(subject) + " the anagram :) of " + String.valueOf(anagram));
		}
		else 
			System.out.println("Sorry your words are not anagram");

		

		int dups[] = new int[] { 2, 3, 1, 2 ,4, 3};
		DuplicateArrayProblem dulpicateNumbers = new DuplicateArrayProblem();

		dulpicateNumbers.solveDulpicateArray(dups);	
		
	}
	
	
	
}
