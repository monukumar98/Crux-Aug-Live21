package Lec19;

public class Maximum_Sum_in_Window_Size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 5, 11, 19, 4 };
		System.out.println(maximumSuminWindow(arr, 3));
	}

	public static int maximumSuminWindow(int[] arr, int k) {
		int sum = 0;
		// 1st window
		for (int i = 0; i < k; i++) {
			sum += arr[i];

		}
		int ans = sum;
		for(int i=k; i<arr.length; i++) {
			sum+=arr[i];// window size k+1
			sum-=arr[i-k];//window size k Shrink
			ans = Math.max(ans, sum);
			
			
		}
		return ans;
		

	}

}
