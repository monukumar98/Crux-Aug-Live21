package Lec56;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionofTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 1, 2, 1, 2, 1, 12, 13, 23, 1, 3, 52, 1, 1 };
		int[] arr2 = { 52, 23, 23, 17, 18, 1, 1, 1, 12, 2, 3, 2, 2, 2, 22 };

	}

	public static int[] intersect(int[] arr1, int[] arr2) {

		ArrayList<Integer> list = new ArrayList<>();

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
//			if (map.containsKey(arr1[i])) {
//				//int f = map.get(arr1[i]);
//				map.put(arr1[i], map.get(arr1[i]) + 1);
//			} else
//				map.put(arr1[i], 1);
			map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);

		}

		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {
				list.add(arr2[i]);
				map.put(arr2[i], map.get(arr2[i]) - 1);
			}

		}
		int [] ans = new int [list.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i]=list.get(i);
		}
		return ans;
	}

}
