package Lec40;

public class Queue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Queue Q = new Queue();
		//System.out.println(Q.Dequeue());
		System.out.println(Q.IS_empty());
		Q.Enqueue(10);
		Q.Enqueue(20);
		Q.Enqueue(30);
		Q.Enqueue(40);	
		System.out.println(Q.getFront());
		System.out.println(Q.size());
		System.out.println(Q.Dequeue());
		System.out.println(Q.getFront());
		Q.Enqueue(50);
		Q.Enqueue(60);
		System.out.println(Q.IS_full());
//		Q.Enqueue(90);
		System.out.println(Q.Dequeue());

		
		
//		System.out.println(Q.getFront());
		//Q.Display();
		System.out.println(Q.size());
		Q.Display();
		
		
		

	}
	static {
		
		System.out.println("I am in Static");
	}

}
