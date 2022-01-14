package Lec64;

import java.util.*;

import Lec56.Hashmap;

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(strs));

	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			int[] fqr = new int[26];
			for (int j = 0; j < strs[i].length(); j++) {
				char ch = strs[i].charAt(j);
				fqr[ch - 'a'] = fqr[ch - 'a'] + 1;

			}
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < fqr.length; j++) {

				sb.append(fqr[j] + " ");

			}
		//	System.out.println(sb+" "+strs[i]);
			if (!map.containsKey(sb.toString())) {
				map.put(sb.toString(), new ArrayList<>());
			}
			map.get(sb.toString()).add(strs[i]);

		}
		List<List<String>> list = new ArrayList<List<String>>();

		for (String key : map.keySet()) {
			list.add(map.get(key));
		}
		return list;

	}

}
