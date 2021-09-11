package Lec13;

public class SubArray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,-3,-4,9};
		System.out.println(SubArray(arr));
		

	}

	public static int SubArray(int[] arr) {

		int ans = Integer.MIN_VALUE;
		int si=0;
		int ei=0;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;

			for (int j = i; j < arr.length; j++) {

				sum = sum + arr[j];

				//ans = Math.max(ans, sum);
				if(ans<sum) {
					ans=sum;
					si=i;
					ei=j;
				}


			}
		}

		return ans;

	}

}
