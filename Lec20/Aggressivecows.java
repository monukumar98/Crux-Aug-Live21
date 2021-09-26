package Lec20;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressivecows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int nos = sc.nextInt();
			int noc = sc.nextInt();
			int[] stall = new int[nos];
			for (int i = 0; i < stall.length; i++) {
				stall[i] = sc.nextInt();
			}
			Arrays.sort(stall);
			System.out.println(mindistance(stall, noc));

		}

	}

	public static int mindistance(int[] stall, int noc) {

		int lo = 0;
		int hi = stall[stall.length - 1] - stall[0];// 9-1
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(stall, noc, mid)) {
				ans = mid;
				lo = mid + 1;

			} else {
				hi = mid - 1;
			}
		}

		return ans;

	}

	public static boolean isitpossible(int[] stall, int noc, int mid) {
		// TODO Auto-generated method stub

		int last_pos=stall[0];
		int cow=1;
		
		for (int i = 1; i < stall.length; i++) {
			if(stall[i]-last_pos>=mid) {
				cow++;
				last_pos=stall[i];
				
			}
			
			if(cow==noc) {
				return true;
			}
			
		}
		
		
		
		
		
		return false;
	}

}
