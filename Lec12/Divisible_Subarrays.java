package Lec12;

public class Divisible_Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -1, -2, 7, 3 };
		System.out.println(DivisibleSubarrays(arr));

	}

	public static long DivisibleSubarrays(int[] arr) {

		int n = arr.length;
		long[] hole = new long[n];
		hole[0] = 1;
		int sum = 0;
		for (int i = 0; i < hole.length; i++) {
			sum += arr[i];
			if (sum < 0) {

				sum = sum % n;
				sum += n;

			}
			sum %= n;
			hole[sum]++;

		}

		long ans = 0;
		for (int i = 0; i < hole.length; i++) {
			if (hole[i] >= 2) {
				long p = hole[i];
				ans = ans + (p * (p - 1)) / 2;

			}

		}
		return ans;

	}

}
