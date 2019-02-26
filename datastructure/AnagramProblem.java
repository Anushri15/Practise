package com.datastructure;

import java.util.Arrays;

/*Anagram problem overview
Construct an algorithm to check whether two words (or phrases) are anagrams or not!
"An anagram is a word or phrase formed by rearranging the letters of a different
word or phrase,typically using all the original letters exactly once"
*/
public class AnagramProblem {

	public boolean solveAnalogProblem(char[] subject, char[] anagram) {

		if (subject.length != anagram.length)
			return false;
		Arrays.sort(subject);
		Arrays.sort(anagram);

		for (int i = 0; i < subject.length; i++) {
			if (subject[i] != anagram[i])
				return false;
		}

		return true;

	}

}
