package Lec21;

public class Kadanes_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -11, -12,  -3, -7, -67 };
		System.out.println(maxSubArraySum(arr));

	}

	public static int maxSubArraySum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int curr_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			curr_sum += arr[i];
			ans = Math.max(curr_sum, ans);
			// change the SubArray
			if (curr_sum < 0) {
				curr_sum = 0;
			}

		}
	return ans;
	}

}
