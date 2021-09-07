package Lec12;

public class Rain_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(TrappingRainWater(arr));

	}

	public static int TrappingRainWater(int[] arr) {
		int n = arr.length;
		int [] left = new int [n];
		int [] right = new int [n];
		left [0]=arr[0];
		right[n-1]=arr[n-1];
		for (int i = 1; i < right.length; i++) {
			left[i]=Math.max(left[i-1], arr[i]);
			
		}
		for (int i = n-2; i>=0; i--) {
			right[i]=Math.max(right[i+1], arr[i]);
			
		}
		int water =0;
		for (int i = 0; i < right.length; i++) {
			water = water + (Math.min(left[i], right[i])-arr[i]);
			
		}
		
		return water ;

	}

}
