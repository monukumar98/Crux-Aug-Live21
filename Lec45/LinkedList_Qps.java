package Lec45;

import Lec44.LinkedList;

public class LinkedList_Qps {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.addLast(4);
		ll.addFirst(5);
		ll.addLast(6);
		ll.AddatIndex(4, 90);
		ll.AddatIndex(2, 100);
		ll.Display();
		//ll.dataReverseI();
		//ll.PointerReverseI();
		//ll.PointerReverseRecursive();
		//ll.DataReverseRecursive();
		//ll.Display();
		System.out.println(ll.mid());
		
		
	}

}
