package Lec31;

import java.util.*;
import java.util.List;

public class SubSet_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 2 };
		Arrays.sort(arr);
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		SubSet(arr, list, ans,0);
		System.out.println(ans);

	}

	public static void SubSet(int[] arr,List<Integer> list ,List<List<Integer>> ans, int idx) {

		ans.add(new ArrayList<Integer>(list));

		for (int i = idx; i < arr.length; i++) {
			if (idx != i && arr[i] == arr[i - 1]) {
				continue;
			}
             list.add(arr[i]);
			SubSet(arr,list,ans, i + 1);
			list.remove(list.size()-1);		

		}

	}

}
