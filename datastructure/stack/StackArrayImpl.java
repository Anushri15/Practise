package com.datastructure.stack;

import java.util.Objects;

public class StackArrayImpl<T> {

	private int count;
	private T[] stack;

	public StackArrayImpl(T[] stack) {
		this.stack = (T[]) new Objects[1];
	}

	public void push(T data) {
		++this.count;

		if (count == this.stack.length) {
			resize(2 * this.stack.length);
		}

		this.stack[this.count] = data;

	}

	public T pop() {
		if (this.stack.length == 0)
			return null;

		T itemTOPop = stack[--this.count];
		this.stack[this.count] = null;
		return itemTOPop;
	}

	public void resize(int capacity) {

		T[] newArray = (T[]) new Objects[capacity];

		for (int i = 0; i < this.count; i++) {

			newArray[i] = stack[i];
		}

		this.stack = newArray;
	}

	public int size() {
		return this.count;
	}

	public boolean isEmpty() {
		if (this.count == 0)
			return false;
		else
			return true;

	}
}
