package Lec65;

import java.util.Arrays;

public class LIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };

	}
// o(n^2)
	public static int lis(int arr[]) {
		int[] dp = new int[arr.length];
		Arrays.fill(dp, 1);
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {
					dp[i] = Math.max(dp[j] + 1, dp[i]);
				}
			}

		}

		int ans = 0;
		for (int i = 0; i < dp.length; i++) {
			ans = Math.max(ans, dp[i]);
		}
		return ans;

	}

}
