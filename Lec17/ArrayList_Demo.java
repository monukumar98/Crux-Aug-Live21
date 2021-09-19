package Lec17;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list.size());
		System.out.println(list);

		// Add
		list.add(10);
		list.add(20);
		System.out.println(list);
		// 0 to size ;
		list.add(1, 30);
		System.out.println(list);

		list.add(1, 40);
		System.out.println(list);
		list.add(3, 190);
		System.out.println(list);

		// Set Update
		// 0 to size-1
		list.set(1, 90);
		System.out.println(list);
		// list.set(5, -90);

		// remove
		// 0 to size-1
		list.add(list.size(), 20);

		System.out.println(list.remove(1));
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		

	}

}
