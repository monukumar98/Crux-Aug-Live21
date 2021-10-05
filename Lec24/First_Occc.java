package Lec24;

public class First_Occc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 2, 4, 5, 6, 2, 4, 6, 9 };
		System.out.println(index(arr, 2, 0));

	}

	public static int index(int[] arr, int item, int i) {
		// negative base case

		if (i == arr.length) {
			return -1;
		}

		// positive base case
		if (arr[i] == item) {
			return i;
		}
          // tail Recursion
		return index(arr, item, i + 1);

	}
}
