package Lec59;

import java.util.Scanner;

public class Preparing_Olympiad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();
		int x = sc.nextInt();
		int[] difficulty_level = new int[n];
		for (int i = 0; i < difficulty_level.length; i++) {

			difficulty_level[i] = sc.nextInt();
		}
		System.out.println(NoContest(n, l, r, x, difficulty_level));

	}

	public static int NoContest(int n, int l, int r, int x, int[] difficulty_level) {

		int count = 0;
		int len = difficulty_level.length;
		for (int i = 2; i < (1 << len); i++) {
			if (FastCountSetBit(i) >= 2 && isvalidConest(i, difficulty_level, l, r, x)) {

				count++;
			}

		}
		return count;

	}

	private static boolean isvalidConest(int i, int[] arr, int l, int r, int x) {
		// TODO Auto-generated method stub
		int pos = 0;
		int total_difficulty = 0;
		int easiest = Integer.MAX_VALUE;
		int hardest = Integer.MIN_VALUE;
		while (i > 0) {
			if ((i & 1) != 0) {
				total_difficulty += arr[pos];
				easiest = Math.min(easiest, arr[pos]);
				hardest = Math.max(hardest, arr[pos]);
			}
			i >>= 1;
			pos++;
		}
		return (total_difficulty >= l && total_difficulty <= r && hardest - easiest >= x);

	}

	public static int FastCountSetBit(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = (n & (n - 1));
		}
		return count;

	}

}
