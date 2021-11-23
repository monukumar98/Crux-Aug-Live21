package Lec42;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.peek());
		System.out.println(s.size());
		System.out.println(s);
		
		Stack<String> s1 = new Stack<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <5; i++) {
			String ss = sc.next();
			s1.push(ss);
		}
		System.out.println(s1);
		
		

	}

}
