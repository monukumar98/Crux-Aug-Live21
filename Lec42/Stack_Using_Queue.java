package Lec42;

import Lec41.DynaicQueue;

public class Stack_Using_Queue {

	private DynaicQueue Primary;
	private DynaicQueue Helper;

	public Stack_Using_Queue() {
		// TODO Auto-generated constructor stub
		this.Primary = new DynaicQueue();
		this.Helper = new DynaicQueue();

	}

	public boolean Is_Empty() {
		return Primary.IS_empty();

	}

	public int size() {

		return this.Primary.size();
	}
// O(N)
	public void push(int item) throws Exception {

		while (!Primary.IS_empty()) {
			int rv = this.Primary.Dequeue();
			this.Helper.Enqueue(rv);
		}

		this.Primary.Enqueue(item);

		while (!Helper.IS_empty()) {
			int rv = this.Helper.Dequeue();
			this.Primary.Enqueue(rv);
		}
	}
	// pop O(1)
	public int pop() throws Exception {
		return this.Primary.Dequeue();
	}
	public int peek() throws Exception {
		return this.Primary.getFront();
	}
	
	
}
