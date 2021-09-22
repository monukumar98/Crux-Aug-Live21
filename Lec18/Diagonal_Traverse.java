package Lec18;

import java.util.ArrayList;

import Lec7.foor_Loop_Demo;

public class Diagonal_Traverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] DiagonalTraverse(int[][] arr) {

		int n = arr.length;
		int m = arr[0].length;
		int ans[] = new int[n * m];
		int p = 0;
		for (int d = 0; d < m + n - 1; d++) {
			int r = 0;
			int c = 0;
			if (d < m) {
				r = 0;
				c = d;
			} else {
				r = d - m + 1;
				c = m - 1;
			}
			ArrayList<Integer> list = new ArrayList<>();
			while (r < n && c >= 0) {
				list.add(arr[r][c]);
				r++;
				c--;

			}

			if (d % 2 == 0) {
				for (int i = list.size() - 1; i >= 0; i--) {
					ans[p] = list.get(i);
					p++;
				}
			} else {
				for (int i = 0; i < list.size(); i++) {
					ans[p] = list.get(i);
					p++;
				}
			}

		}
		return ans;
	}

}
