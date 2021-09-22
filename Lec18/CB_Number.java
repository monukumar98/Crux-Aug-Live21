package Lec18;

import java.util.Scanner;

public class CB_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(CountCBnumber(str));

	}

	public static int CountCBnumber(String str) {
		boolean[] visited = new boolean[str.length()];
		int count = 0;
		for (int len = 1; len <= str.length(); len++) {
			for (int si = 0; si <= str.length() - len; si++) {
				int ei = len + si;
				String st = str.substring(si, ei);// i to j-1
				// System.out.println(st);
				if (IScbNumber(Long.parseLong(st)) && Isvisited(visited, si, ei - 1)) {
					count++;
					// System.out.println(st);
					// Mark
					for (int idx = si; idx <= ei - 1; idx++) {
						visited[idx] = true;

					}

				}

			}
		}
		return count;
	}

	public static boolean Isvisited(boolean[] visited, int i, int j) {
		// TODO Auto-generated method stub

		for (int idx = i; idx <= j; idx++) {
			if (visited[idx]) {
				return false;
			}
		}

		return true;
	}

	public static boolean IScbNumber(long n) {
		// point 1
		if (n == 0 || n == 1) {
			return false;
		}
		int[] cb = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		// point 2
		for (int i = 0; i < cb.length; i++) {
			if (cb[i] == n) {
				return true;
			}

		}

		// point 3
		for (int i = 0; i < cb.length; i++) {
			if (n % cb[i] == 0) {
				return false;
			}

		}
		return true;

	}

}
