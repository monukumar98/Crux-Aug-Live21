package Lec55;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		
		// put O(1)
		map.put("Ram", -99);
		map.put("Ram", 90);
		map.put("Rohan", 87);
		map.put("Pooja", 85);
		map.put("Kamal", 90);
		map.put("Amisha", 95);
		// map.put(null, 9);
		System.out.println(map);
//		// Get O(1)
//		System.out.println(map.get("Ram"));
//		System.out.println(map.get("Kunal"));
//		// Remove O(1)
//		System.out.println(map.remove("Ram"));// value
//		System.out.println(map.remove("Kunal"));// null
//		System.out.println(map);
//
//		// ContainKey o(1)
//		System.out.println(map.containsKey("Kunal"));
//		System.out.println(map.containsKey("Amisha"));

//		// part-1
//		Set<String> key = map.keySet();//[Amisha,Pooja,Kamal,Rohan]
//		for (String k : key) {
//               System.out.println(k+"-->"+map.get(k));
//		}
//
//		
//		
//		// Part-2
//		ArrayList<String> l = new ArrayList<>(map.keySet());
//		ArrayList<Integer> ll = new ArrayList<>(90);
//		
//		
//		// Part-3
//		
//		for (String k : map.keySet()) {
//			System.out.println(k + "-->" + map.get(k));
//		}
//		
		
		TreeMap<String, Integer> map1= new TreeMap<>();
		map1.put("Ram", -99);
		map1.put("Ram", 90);
		map1.put("Rohan", 87);
		map1.put("Pooja", 85);
		map1.put("Kamal", 90);
		map1.put("Amisha", 95);
//		map1.put(null, 10);
		System.out.println(map1);// Sorted 
		
		LinkedHashMap<String, Integer> map2=new LinkedHashMap<>();
		map2.put("Ram", -99);
		map2.put("Ram", 90);
		map2.put("Rohan", 87);
		map2.put("Pooja", 85);
		map2.put("Kamal", 90);
		map2.put("Amisha", 95);
		map2.put(null, 10);
		System.out.println(map2);// 

	}

}
