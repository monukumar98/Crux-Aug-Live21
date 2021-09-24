package Lec19;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 1 ,11};
		int k = 10;
		System.out.println(numSubarrayProductLessThanK(arr, k));
	}

	public static int numSubarrayProductLessThanK(int[] nums, int k) {
		if (k == 0) {
			return k;
		}
		int si = 0;
		int ei = 0;
		int p = 1;
		int ans = 0;
		while (ei < nums.length) {

			p *= nums[ei];

			// Window Shrink honga ya nhi
			while (p >= k && si <=ei) {
				p /= nums[si];
				si++;
			}
			// Window Size CalCulate

			ans += (ei - si + 1);
			ei++;

		}
		return ans;

	}

}
