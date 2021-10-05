package Lec24;

public class All_occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 2, 4, 5, 2, 6, 2, 4, 6, 9 };
		// index(arr, 2, 0);
		int[] ans = index2(arr, 2, 0, 0);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();
	}

	public static void index(int[] arr, int item, int i) {
		// negative base case

		if (i == arr.length) {
			return;
		}

		// positive base case
		if (arr[i] == item) {
			System.out.print(i + " ");
		}

		index(arr, item, i + 1);

	}

	public static int[] index2(int[] arr, int item, int i, int count) {
		// negative base case

		if (i == arr.length) {

			return new int[count];

		}

		// positive base case
		if (arr[i] == item) {
			count++;
		}

		int[] ans = index2(arr, item, i + 1, count);
		if (arr[i] == item) {
			ans[count - 1] = i;
		}
		return ans;

	}
}
