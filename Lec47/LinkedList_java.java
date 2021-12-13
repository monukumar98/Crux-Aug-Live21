package Lec47;

import java.util.LinkedList;

public class LinkedList_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(2);//last add
		ll.add(3);
		System.out.println(ll);
		ll.addLast(4);
		ll.addFirst(56);
		System.out.println(ll);
		//System.out.println(ll.remove());//first
		//System.out.println(ll.removeLast());
		System.out.println(ll.removeFirst());
		System.out.println(ll);
		System.out.println(ll.getFirst());

		

	}

}
