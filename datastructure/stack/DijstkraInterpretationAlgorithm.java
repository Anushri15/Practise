package com.datastructure.stack;
import java.util.Stack;

public class DijstkraInterpretationAlgorithm {

	private java.util.Stack<String> expressions;
	private java.util.Stack<Double> values;

	public DijstkraInterpretationAlgorithm() {
		this.expressions = new Stack();
		this.values = new Stack();
	}

	public void result() {
		System.out.println(this.values.pop());
		
	}
	public void interpretExpression(String expression) {

		String[] expressions = expression.split(" ");

		for (String token : expressions) {
			switch (token) {

			case "(":
				// ignore the left parentheses
				break;
			case "*":
			case "+":
			case "-":
				this.expressions.push(token);
				break;
			case ")": {
				Double val = this.values.pop();
				String op = this.expressions.pop();
				switch (op) {
				case "+":
					val = values.pop() + val;
					break;
				case "*":
					val = values.pop() * val;
					break;
				case "-":
					val = values.pop() - val;
					break;
				}
				
				 this.values.push(val);
			}
			break;
			default:
				this.values.push(Double.parseDouble(token));
				break;
			}
		}
		
	}
}