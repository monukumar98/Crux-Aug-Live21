package Lec22;

import java.util.*;

public class Murthal_Parantha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int no_of_cook = sc.nextInt();
		int arr[] = new int[no_of_cook];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(no_of_prantha(arr, p));

	}

	public static int no_of_prantha(int arr[], int p) {
		Arrays.sort(arr);
		int lo = 0;
		int hi = (arr[arr.length - 1] * (p * (p + 1))) / 2;// int hi=4*(p*p+1)/2;
		// System.out.println(hi);
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(mid, p, arr)) {
				ans = mid;
				hi = mid - 1;

			} else {
				lo = mid + 1;

			}

		}
		return ans;

	}

	private static boolean isitpossible(int mid, int p, int[] arr) {
		// TODO Auto-generated method stub
		int curr_pno = 1;
		int total_time = 0;
		int total_pno = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] * curr_pno + total_time <= mid) {
				total_pno++;
				
				total_time += arr[i] * curr_pno;
				curr_pno++;

			} else {
				
				total_time = 0;
				curr_pno = 1;
				i++;
			}
			if (total_pno >= p) {
				return true;
			}

		}

		return false;
	}
}
