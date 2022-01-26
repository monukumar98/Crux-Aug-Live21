package Lec66;

import java.util.Arrays;

public class Coin_Change_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 5, 6 };
		int amount = 10;
		int[][] dp = new int[amount + 1][coin.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}

		System.out.println(CoinChanges(coin, amount, 0, dp));
		System.out.println(CoinChanges2(coin, amount, coin.length - 1, dp));

	}

	public static int CoinChanges(int[] coin, int amount, int i, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (i == coin.length) {
			return 0;
		}
		if (dp[amount][i] != -1) {
			return dp[amount][i];
		}

		int inc = 0;
		int exc = 0;
		if (amount >= coin[i]) {// dp[amount-coin[i][i];
			inc = CoinChanges(coin, amount - coin[i], i, dp);
		}

		exc = CoinChanges(coin, amount, i + 1, dp);// dp[ammount][i

		return dp[amount][i] = inc + exc;
	}

	public static int CoinChanges(int[] coin, int amount) {
		int[][] dp = new int[amount + 1][coin.length + 1];
		// base case
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i] = 1;

		}
		dp[0][0] = 0;
		for (int am = 1; am <= amount; am++) {
			for (int c = 1; c <= coin.length; c++) {
				int inc = 0;
				int exc = 0;
				if (am >= coin[c - 1]) {
					inc = dp[am - coin[c - 1]][c];
				}
				exc = dp[am][c - 1];
				dp[am][c] = inc + exc;
			}

		}
		return dp[amount][coin.length];

	}

	public static int CoinChanges2(int[] coin, int amount, int i, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (i == coin.length) {
			return 0;
		}
		if (dp[amount][i] != -1) {
			return dp[amount][i];
		}

		int inc = 0;
		int exc = 0;
		if (amount >= coin[i]) {// dp[amount-coin[i][i];
			inc = CoinChanges2(coin, amount - coin[i], i, dp);
		}

		exc = CoinChanges2(coin, amount, i - 1, dp);// dp[ammount][i

		return dp[amount][i] = inc + exc;
	}

}
