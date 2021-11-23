package Lec42;

import java.util.Stack;

import Lec41.DynaicQueue;

public class Queue_Reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynaicQueue dq = new DynaicQueue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		dq.Dequeue();
		dq.Dequeue();
		dq.Enqueue(60);
		dq.Enqueue(70);
		dq.Display();
		System.out.println(">>>>>>>>>>>>>>>>");
		Reverse(dq);
		dq.Display();
	}
	private static void Reverse(DynaicQueue dq) throws Exception {
		
		if(dq.IS_empty()) {
			return;
		}
		int item = dq.Dequeue();
		Reverse(dq);
		dq.Enqueue(item);
		
		
	}

}
