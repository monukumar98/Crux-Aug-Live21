package Lec67;

public class Uncrossed_Lines {
	public static void main(String[] args) {

	}

	public static int lcsBU(int[] s, int[] t) {
		int[][] dp = new int[s.length + 1][t.length + 1];
		for (int i = 1; i <= s.length; i++) {
			for (int j = 1; j <= t.length; j++) {

				int ans = 0;
				if (s[i - 1] == t[j - 1]) {
					ans = dp[i - 1][j - 1] + 1;

				} else {
					ans = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
				dp[i][j] = ans;

			}

		}

		return dp[s.length][t.length];

	}
}
