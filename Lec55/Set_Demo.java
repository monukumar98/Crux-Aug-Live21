package Lec55;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(5);
		set.add(15);
		set.add(-10);
		System.out.println(set);
//		//remove
//		System.out.println(set.remove(10));
//		System.out.println(set);
//		
//		//Contains
//		System.out.println(set.contains(10));
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(5);
		set1.add(15);
		set1.add(-10);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(10);
		set2.add(20);
		set2.add(5);
		set2.add(15);
		set2.add(-10);
		System.out.println(set2);
		

	}

}
