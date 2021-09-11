package Lec13;

public class First_Bad_Version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int firstBadVersion(int n) {
		int lo = 0;
		int hi = n;
		int ans = 0;
		while (lo <= hi) {
			int mid = lo+( hi-lo) / 2;
			if (isBadVersion(mid)) {
				ans = mid;
				hi = mid - 1;

			} 
			else {
				lo = mid + 1;
			}

		}
		return ans;

	}

}
