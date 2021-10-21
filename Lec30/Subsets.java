package Lec30;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		//subset_ele(arr, 0, list, ans);
		subset_user(arr, 0, list, ans);
		System.out.println(ans);

	}

	public static void subset_ele(int[] arr, int i, List<Integer> list, List<List<Integer>> ans) {
		if (i == arr.length) {
			ans.add(new ArrayList<Integer>(list));
			return;
		}

		subset_ele(arr, i + 1, list, ans);// no
		list.add(arr[i]);
		subset_ele(arr, i + 1, list, ans);// yes
		list.remove(list.size() - 1);

	}

	public static void subset_user(int[] arr, int i, List<Integer> list, List<List<Integer>> ans) {

		ans.add(new ArrayList<Integer>(list));
		
		
		for (int j = i; j < arr.length; j++) {

			list.add(arr[j]);
			subset_user(arr, j + 1, list, ans);
			list.remove(list.size() - 1);

		}

	}

}
