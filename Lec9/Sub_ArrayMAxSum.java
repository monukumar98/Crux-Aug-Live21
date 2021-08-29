package Lec9;

public class Sub_ArrayMAxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, -3, -5, 4, 3, -7 };
		System.out.println(SubArray(arr));
	
		

	}

	public static int SubArray(int[] arr) {

		int ans = Integer.MIN_VALUE;
		int si=0;
		int ei=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {// print i to j

					sum =sum+ arr[k];

				}
				//ans = Math.max(ans, sum);
				if(ans<sum) {
					ans=sum;
					si=i;
					ei=j;
				}

				
			}

		}
		for (int i = si; i <=ei; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		return ans;

	}

}
