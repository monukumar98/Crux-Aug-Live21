package Lec68;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] dp = new int[grid.length][grid[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < grid[0].length; i++) {
			ans = Math.min(ans, MinfallPathSum(grid, 0, i, dp));

		}
		System.out.println(ans);

	}

	public static int MinfallPathSum(int[][] matrix, int cr, int cc, int[][] dp) {

		if (cc < 0 || cc >= matrix[0].length) {
			return Integer.MAX_VALUE;
		}
		if (cr == matrix.length - 1) {
			return matrix[cr][cc];
		}
		if (dp[cr][cc] != -1) {
			return dp[cr][cc];
		}
	
		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < matrix[0].length; i++) {
			if (i != cc) {
				ans = Math.min(ans, MinfallPathSum(matrix, cr + 1,  i, dp));
			}
		}

		return dp[cr][cc] = ans + matrix[cr][cc];

	}

}
