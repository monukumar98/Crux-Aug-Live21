package Lec22;

import java.util.Scanner;

public class K_Character_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			int k = sc.nextInt();
			System.out.println(uniquecharacter(s, k));
		}

	}

	public static int uniquecharacter(String s, int k) {
		// TODO Auto-generated method stub
		if (k > s.length()) {
			return -1;
		}
		int si = 0;
		int ei = 0;
		int ans = -1;
		int count = 0;
		int[] freq = new int[128];
		while (ei < s.length()) {
			char ch = s.charAt(ei);
			if (freq[ch] == 0) {
				count++;
			}
			freq[ch]++;

			// shrinking
			while (count > k) {
				ch = s.charAt(si);
				freq[ch]--;

				if (freq[ch] == 0) {
					count--;
				}
				si++;
			}

			// ans update
			if (count == k) {
				ans = Math.max(ans, ei - si + 1);
			}
			ei++;

		}

		return ans;

	}

}
