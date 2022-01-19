package Lec65;

public class Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] dp = new int[n + 1];
		System.out.println(noofways(n));

	}

	public static int noofways(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		int s1 = noofways(n - 1);
		int s2 = noofways(n - 2);
		return s1 + s2;

	}

	public static int noofwaysTD(int n, int[] dp) {
		if (n == 0 || n == 1) {
			return 1;
		}
		if (dp[n] != 0) {
			return dp[n];
		}

		int s1 = noofwaysTD(n - 1, dp);
		int s2 = noofwaysTD(n - 2, dp);
		return dp[n] = s1 + s2;

	}

	public static int noofwaysBU(int n) {
		int[] dp = new int[n + 1];

		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];

		}
		return dp[n];
	}

}
