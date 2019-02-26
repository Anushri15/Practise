package com.datastructure;

public class ReversingGivenArray {
//Running time of the algorithm is O(N)
	public int[] inputArray(int arrayOfInt[]) {
		int startIndex = 0;
		int endIndex = arrayOfInt.length - 1;
		while (endIndex>startIndex) {
			//We swap 2 numbers in one iteration so its N/2 iterations
			swap(arrayOfInt, startIndex, endIndex);
			startIndex++;
			endIndex--;
		}

		return arrayOfInt;
	}

	private void swap(int[] arrayOfInt, int startIndex, int endIndex) {
		int temp;
		temp = arrayOfInt[startIndex];
		arrayOfInt[startIndex] = arrayOfInt[endIndex];
		arrayOfInt[endIndex] = temp;
	}

}
