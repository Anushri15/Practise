package com.datastructure.stack;


public class StackTesting {

	public static void main(String[] args) {

		/*
		 * Stack<Integer> nums = new Stack<>(); nums.push(1); nums.push(2);
		 * nums.push(3); nums.push(4); System.out.println(nums.pop());
		 * System.out.println(nums.pop()); System.out.println(nums.pop());
		 * System.out.println(nums.pop());
		 */

		/*
		 * DijstkraInterpretationAlgorithm calculator = new
		 * DijstkraInterpretationAlgorithm();
		 * 
		 * calculator.interpretExpression("( 2 * 3 ) + 4 )"); calculator.result();
		 */

		MaxItemStackProblem numbers = new MaxItemStackProblem();
		numbers.push(1);
		numbers.push(10);
		numbers.push(12);
		numbers.push(31);
		numbers.push(15);
		numbers.push(81);
		System.out.println(numbers.maxNumber());

		
	}

}
