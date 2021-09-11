package Lec13;

public class Sqrt_root {
	public static void main(String[] args) {

	}

	public static int binarySearch(int n) {

		int lo = 0;
		int hi = n;
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (mid * mid <= n) {
				ans = mid;
				lo = mid + 1;

			}
			else {
				hi = mid - 1;
			}

		}
		return ans;

	}

}
