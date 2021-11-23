package Lec42;

import java.util.Stack;

public class Stack_Revrse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s);
		System.out.println("**** ***** ***** ****");
		Reverse(s);
		System.out.println(s);
	}

	public static void Reverse(Stack<Integer> s) {
		if (s.isEmpty()) {
			return;
		}

		int item = s.pop();
		Reverse(s);
		Insert_Down(s,item);

	}

	private static void Insert_Down(Stack<Integer> s, int item) {
		// TODO Auto-generated method stub
		if(s.isEmpty()) {
			s.push(item);
			return;
		}
		
		int rv= s.pop();
		Insert_Down(s, item);
		s.push(rv);
		
		
		
	}

}
