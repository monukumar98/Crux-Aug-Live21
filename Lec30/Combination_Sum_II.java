package Lec30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II {
	public static void main(String[] args) {
		int[] arr = { 10, 1, 2, 2, 1, 2, 7, 6, 1, 5 };
		Arrays.sort(arr);
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		coinCombination(arr, 8, 0, list, ans);
		System.out.println(ans);
	}

	public static void coinCombination(int[] coin, int amount, int idx, List<Integer> list, List<List<Integer>> ans) {
		// TODO Auto-generated method stub
		if (amount == 0) {

			ans.add(new ArrayList<>(list));
			return;
		}

		for (int i = idx; i < coin.length; i++) {
//			if (i != idx && coin[i - 1] == coin[i]) {
//				continue;
//			}

			if (amount >= coin[i]) {
				amount -= coin[i];// Cap
				list.add(coin[i]);
				coinCombination(coin, amount, i + 1, list, ans);
				list.remove(list.size() - 1);
				amount += coin[i];// Cap Remove

				while (i + 1 < coin.length && coin[i] == coin[i + 1]) {
					i++;
				}
			}

		}

	}
}
