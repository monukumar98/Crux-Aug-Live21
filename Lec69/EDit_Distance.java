package Lec69;

import java.util.Scanner;

public class EDit_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			String a = sc.next();
			String b = sc.next();
			int [] [] dp = new int [a.length()][b.length()];
			for (int i = 0; i < dp.length; i++) {
				for (int j = 0; j < dp[0].length; j++) {
					dp[i][j]=-1;
				}
			}
			System.out.println(EditDistance(a, b, 0, 0,dp));
			t--;

		}

	}

	public static int EditDistance(String a, String b, int i, int j,int [][]dp) {
		if (i == a.length()) {
			return b.length() - j;
		}

		if (j == b.length()) {
			return a.length() - i;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}

		int ans = 0;
		if (a.charAt(i) == b.charAt(j)) {
			ans = EditDistance(a, b, i + 1, j + 1,dp);

		} else {
			int delete = EditDistance(a, b, i + 1, j,dp);//dp[i-1][j]
			int insert = EditDistance(a, b, i, j + 1,dp);//dp[i][j-1]
			int replace = EditDistance(a, b, i + 1, j + 1,dp);//dp[i-1][j-1]
			ans = Math.min(delete, Math.min(replace, insert)) + 1;
		}
		return dp[i][j]=ans;

	}

}
