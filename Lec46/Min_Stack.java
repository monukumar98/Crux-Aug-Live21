package Lec46;

import java.util.Stack;

public class Min_Stack {

	private Stack<Integer> s;
	private int min;

	public Min_Stack() {
		// TODO Auto-generated constructor stub
		this.s = new Stack<>();
	}

	public void push(int item) {
		if (this.s.isEmpty() || item > this.min) {
			if (this.s.isEmpty()) {
				this.s.push(item);
				this.min = item;
			} else {
				this.s.push(item);
			}
		} else {
			int val = 2 * item - this.min;
			this.s.push(val);
			this.min = item;

		}

	}

	public int pop() throws Exception {

		if (this.s.isEmpty()) {

			throw new Exception("Pgl hai ??");
		}

		if (this.s.peek() < this.min) {
			int pop_data = s.pop();
			int rd = this.min;// 2
			this.min = 2 * this.min - pop_data;
			return rd;

		} else {
			return this.s.pop();
		}

	}

	public int size() {
		return this.s.size();
	}

	public int min() {
		return this.min;
	}

	public int peek() throws Exception {

		if (this.s.isEmpty()) {

			throw new Exception("Pgl hai ??");
		}

		if (this.s.peek() < this.min) {
			return this.min;

		} else {
			return this.s.peek();
		}

	}

	public void Display() {
		System.out.println(this.s);
	}

}
