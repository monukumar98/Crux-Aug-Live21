package Lec68;

import java.util.Arrays;

public class Minimum_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int[][] dp = new int[grid.length][grid[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(pathsum(grid, 0, 0, dp));

	}

	public static int pathsum(int[][] grid, int cc, int cr, int[][] dp) {
		if (cr >= grid.length || cc >= grid[0].length) {
			return Integer.MAX_VALUE;
		}
		if (cr == grid.length - 1 && cc == grid[0].length - 1) {
			return grid[cr][cc];
		}

		if (dp[cr][cc] != -1) {
			return dp[cr][cc];
		}

		int down = pathsum(grid, cc, cr + 1, dp);// dp[i][j+1]
		int right = pathsum(grid, cc + 1, cr, dp);

		return dp[cr][cc] = Math.min(down, right) + grid[cr][cc];

	}

	public static int pathsumBU(int[][] grid) {
		int[][] dp = new int[grid.length][grid[0].length];
		dp[0][0] = grid[0][0];
		for (int i = 1; i < grid[0].length; i++) {
			dp[0][i] = dp[0][i - 1] + grid[0][i];
		}

		for (int i = 1; i < dp.length; i++) {
			dp[i][0] = dp[i - 1][0] + grid[i][0];

		}

		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp.length; j++) {
				int cost = Math.min(dp[i - 1][j], dp[i][j - 1]);
				dp[i][j] = cost + grid[i][j];

			}

		}
		return dp[grid.length-1][grid[0].length-1];

	}

}
