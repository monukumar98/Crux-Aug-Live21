package Lec68;

import java.util.Arrays;

public class Dot_Prodouct_OfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { -5, -1 };
		int[] arr2 = { -3, 5 };
		int[][] dp = new int[arr1.length][arr2.length];
		for (int[] a : dp) {
			Arrays.fill(a, -100000000);
		}
		System.out.println(maxDotProduct(arr1, arr2, 0, 0, false,dp));

	}

	public static int maxDotProduct(int[] arr1, int[] arr2, int i, int j, boolean istaken,int [][]dp) {

		if (i == arr1.length || j == arr2.length) {
			if (istaken == true) {
				return 0;

			} else {
				return -1000000;
			}

		}
		if(dp[i][j]!=-100000000) {
			return dp[i][j];
		}
		

		int dotproduct = arr1[i] * arr2[j] + maxDotProduct(arr1, arr2, i + 1, j + 1, true,dp);
		int fd = maxDotProduct(arr1, arr2, i + 1, j, false,dp);
		int sd = maxDotProduct(arr1, arr2, i, j + 1, false,dp);

		return dp[i][j]=Math.max(arr1[i] * arr2[j], Math.max(fd, Math.max(sd, dotproduct)));

	}

}
