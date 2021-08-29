package Lec9;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 3, 67, 8, 9 };
		System.out.println(maxidex(arr));

	}

	public static int maxidex(int[] arr) {

		int idx = -1;
		int max = Integer.MIN_VALUE;// -2^31
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				idx = i;
				max = arr[i];

			}

		}
		return idx;
	}

}
