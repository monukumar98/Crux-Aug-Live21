package Lec65;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 3, 5 };
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);

	}

	public static int Rob(int[] arr, int i) {

		if (i >= arr.length) {
			return 0;
		}

		int Dont_Rob = Rob(arr, i + 1);
		int Do_Rob = Rob(arr, i + 2) + arr[i];

		return Math.max(Dont_Rob, Do_Rob);

	}

	public static int RobTD(int[] arr, int i, int[] dp) {

		if (i >= arr.length) {
			return 0;
		}

		if (dp[i] != -1) {
			return dp[i];
		}

		int Dont_Rob = RobTD(arr, i + 1, dp);
		int Do_Rob = RobTD(arr, i + 2, dp) + arr[i];

		return dp[i] = Math.max(Dont_Rob, Do_Rob);

	}

	public static int RobBU(int[] arr) {
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);

		for (int i = 0; i < dp.length; i++) {
			int Dont_Rob = dp[i - 1];
			int Do_Rob = dp[i - 2] + arr[i];
			dp[i]=Math.max(Dont_Rob, Do_Rob);

		}
		return dp[arr.length - 1];

	}
}
