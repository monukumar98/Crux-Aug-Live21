package Lec69;

public class MCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] matrix = { 4, 2, 3, 5, 1 };
		System.out.println(Mcm(matrix, 0, matrix.length-1));

	}

	public static int Mcm(int[] arr, int si, int ei) {
		if(si+1==ei) {
			return 0;
		}

		int ans = Integer.MAX_VALUE;
		for (int k = si + 1; k < ei; k++) {

			int fs = Mcm(arr, si, k);
			int ss = Mcm(arr, k, ei);
			int sw = arr[si] * arr[ei] * arr[k];

			ans = Math.min(ans, fs + ss + sw);

		}
		return ans;

	}

}
