package Lec21;

public class Maximum_Sum_Circular_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -11, -12, 4, -7, -67 };
		System.out.println(Circular_Subarray(arr));
		
		
		
		
	}
	public static int Circular_Subarray(int []arr) {
		int linear_sum=maxSubArraySum(arr);
		int total_sum=0;
		for (int i = 0; i < arr.length; i++) {
			total_sum+=arr[i];
			arr[i]*=-1;
		}
		
		int mid_sum= maxSubArraySum(arr);
		int cir_sum=total_sum+mid_sum;
		return Math.max(linear_sum, cir_sum);
		
		
	}

	public static int maxSubArraySum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int curr_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			curr_sum += arr[i];
			ans = Math.max(curr_sum, ans);
			// change the Subarray
			if (curr_sum < 0) {
				curr_sum = 0;
			}

		}
		return ans;
	}

}
