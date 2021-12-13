package Lec47;

import Lec44.LinkedList;

public class Qps_LinkedList {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		ll.addLast(7);
		ll.addLast(8);
		ll.create_Cycle();
		// ll.Display();
		// System.out.println(ll.kthfromend(2));
		System.out.println(ll.FloyedCycledetcion());
		//ll.CycleRemoval2();
		ll.FloyedCycleRemoval();
		System.out.println(ll.FloyedCycledetcion());
		ll.Display();
	}

}
