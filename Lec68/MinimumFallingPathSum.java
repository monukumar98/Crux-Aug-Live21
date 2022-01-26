package Lec68;

import java.util.Arrays;

public class MinimumFallingPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int[][] dp = new int[matrix.length][matrix[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		int ans = Integer.MAX_VALUE;
		
		
		for (int i = 0; i < matrix[0].length; i++) {
			ans = Math.min(ans, MinfallPathSum(matrix, 0, i,dp));

		}
		System.out.println(ans);

	}

	public static int MinfallPathSum(int[][] matrix, int cr, int cc,int [][]dp) {

		if (cc < 0 || cc >= matrix[0].length) {
			return Integer.MAX_VALUE;
		}
		if (cr == matrix.length - 1) {
			return matrix[cr][cc];
		}
		if(dp[cr][cc]!=-1) {
			return dp[cr][cc];
		}
		// (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1).

		int p1 = MinfallPathSum(matrix, cr + 1, cc - 1,dp);
		int p2 = MinfallPathSum(matrix, cr + 1, cc,dp);
		int p3 = MinfallPathSum(matrix, cr + 1, cc + 1,dp);

		return dp[cr][cc]=Math.min(p1, Math.min(p2, p3)) + matrix[cr][cc];

	}

}
