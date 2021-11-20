package Lec40;

public class Stack {

	protected int[] arr;
	private int top;

	public Stack() {
		// TODO Auto-generated constructor stub
		this.arr = new int[5];
		this.top = 0;

	}

	public Stack(int cap) {
		// TODO Auto-generated constructor stub
		this.arr = new int[cap];
		this.top = 0;

	}

	public boolean Is_empty() {
		return this.top == 0;

	}

	public boolean Is_Full() {
		return this.top == this.arr.length;

	}

	public void push(int item) throws Exception {

		if (this.Is_Full()) {
			throw new Exception("pgl hai kya Stack full hai");
		}
         
		this.arr[this.top] = item;
		top++;

	}

	public int pop() throws Exception {

		if (this.Is_empty()) {
			throw new Exception("Sun bhai jb Stack kaahli hai  to,data  pop kyu krni hai ");
		}

		this.top--;
		int item = this.arr[top];
		this.arr[top] = 0;
		return item;

	}

	public int peek() throws Exception {
		if (this.Is_empty()) {
			throw new Exception(" Tu rehne de terese se nhi hoga  ");
		}

		int item = this.arr[top - 1];

		return item;
	}

	public int size() {
		return top;
	}

	public void Display() {
		for (int i = 0; i < top; i++) {
			System.out.print(this.arr[i] + "-->");

		}
		System.out.println(".");
	}

}
