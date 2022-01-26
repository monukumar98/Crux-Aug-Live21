package Lec66;

public class Knapsack {
	public static void main(String[] args) {
		int val = 4;
		int[] wt = { 1, 2, 3, 2, 2 };
		int[] cost = { 8, 4, 0, 5, 3 };

		System.out.println(Knapsack_Rec(wt, cost, val, 0));
		System.out.println(Knapsack_BU(wt, cost, val));
		System.out.println(Knapsack_Back(wt, cost, val, wt.length - 1));

	}

	public static int Knapsack_Rec(int[] wt, int[] cost, int val, int i) {
		if (val == 0 || i == wt.length) {
			return 0;
		}

		int inc = 0;
		int exc = 0;
		if (val >= wt[i]) {
			inc = Knapsack_Rec(wt, cost, val - wt[i], i + 1) + cost[i];
		}
		exc = Knapsack_Rec(wt, cost, val, i + 1);

		return Math.max(inc, exc);

	}

	public static int Knapsack_BU(int[] wt, int[] cost, int val) {
		int[][] dp = new int[val + 1][cost.length + 1];

		for (int v = 1; v <= val; v++) {
			for (int i = 1; i <= wt.length; i++) {
				int inc = 0;
				int exc = 0;
				if (v >= wt[i - 1]) {
					inc = dp[v - wt[i - 1]][i - 1] + cost[i - 1];
				}
				exc = dp[v][i - 1];
				dp[v][i] = Math.max(inc, exc);

			}

		}
		return dp[val][cost.length];

	}

	public static int Knapsack_Back(int[] wt, int[] cost, int val, int i) {
		if (val == 0 || i < 0) {
			return 0;
		}

		int inc = 0;
		int exc = 0;
		if (val >= wt[i]) {
			inc = Knapsack_Back(wt, cost, val - wt[i], i - 1) + cost[i];// dp[val-wt[i][i-1]
		}
		exc = Knapsack_Back(wt, cost, val, i - 1);// dp[val] [i-1]

		return Math.max(inc, exc);

	}

}
