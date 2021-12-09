package Lec44;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception {
		LinkedList ll = new LinkedList();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.Display();
		ll.addLast(4);
		ll.addFirst(5);
		ll.addLast(6);
		ll.Display();
		ll.AddatIndex(4, 90);
		ll.Display();
//		System.out.println(ll.GetFirst());
//		System.out.println(ll.GetLast());
//		System.out.println(ll.GetatAnyIndex(3));
//		System.out.println(ll.RemoveFirst());
//		ll.Display();
//		System.out.println(ll.RemoveLast());
//
//		ll.Display();
		System.out.println(ll.RemoveatAnyIndex(3));
		ll.Display();
		
	}

}
