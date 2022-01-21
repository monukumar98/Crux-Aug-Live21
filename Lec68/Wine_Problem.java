package Lec68;

public class Wine_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int wine[] = { 2, 3, 5, 1, 4 };
		int[][] dp = new int[wine.length][wine.length];
		System.out.println(maxProfit(wine, 0, wine.length - 1, 1, dp));
		System.out.println(WineBu(wine));

	}

	public static int maxProfit(int[] wine, int i, int j, int year, int[][] dp) {
		if (i > j) {
			return 0;
		}
		if (dp[i][j] != 0) {
			return dp[i][j];
		}
		int p1 = wine[i] * year + maxProfit(wine, i + 1, j, year + 1, dp);
		int p2 = wine[j] * year + maxProfit(wine, i, j - 1, year + 1, dp);
		return dp[i][j] = Math.max(p1, p2);

	}

	public static int WineBu(int[] wine) {

		int[][] dp = new int[wine.length][wine.length];
		for (int i = 0; i < dp.length; i++) {
			dp[i][i] = wine[i] * wine.length;

		}
		int year = wine.length - 1;

		for (int slide = 1; slide < dp.length; slide++) {

			for (int j = slide; j < dp.length; j++) {
				int i = j - slide;

				int p1 = wine[i] * year + dp[i + 1][j];
				int p2 = wine[j] * year + dp[i][j - 1];
				dp[i][j] = Math.max(p1, p2);

			}
			year--;

		}

		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp.length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();

		}

		return dp[0][wine.length - 1];

	}

}
