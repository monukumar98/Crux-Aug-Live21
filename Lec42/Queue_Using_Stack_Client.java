package Lec42;

public class Queue_Using_Stack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue_Using_Stack qs = new 	Queue_Using_Stack();
		qs.Enqueue(10);
		qs.Enqueue(20);
		qs.Enqueue(30);
		qs.Enqueue(40);
		qs.Enqueue(50);
		qs.Enqueue(60);
		System.out.println(qs.GetFront());
		System.out.println(qs.DeQueue());
		System.out.println(qs.GetFront());
		

	}

}
