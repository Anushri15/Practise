package com.datastructure.stack;

/*Max in a stack problem overview
The aim is to design an algorithm that can return the maximum item of a stack in O(1) running time complexity. We can use O(N) extra memory!
Hint: we can use another stack to track the max item
*/

public class MaxItemStackProblem {

	private java.util.Stack<Integer> mainStack;
	private java.util.Stack<Integer> maxStack;

	public MaxItemStackProblem() {
		this.mainStack = new java.util.Stack<>();
		this.maxStack = new java.util.Stack<>();
	}

	public void push(int number) {
		mainStack.push(number);

		if (mainStack.size() == 1) {
			maxStack.push(number);
			return;
		}
		if (number > maxStack.peek()) {
			maxStack.push(number);
		} else
			maxStack.push(maxStack.peek());
	}

	public int maxNumber() {
		return maxStack.peek();
	}
}
