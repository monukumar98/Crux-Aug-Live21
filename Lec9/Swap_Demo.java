package Lec9;

public class Swap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 100, 200, 3, 4, 5, 6, 7 };
		System.out.println(arr[0] + " " + arr[1]);
		Swap1(arr, 0, 1);
		System.out.println(arr[0] + " " + arr[1]);

	}

	public static void Swap1(int[] arr, int i, int j) {

		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;

	}

	public static void Swap(int a, int b) {

		int t = a;
		a = b;
		b = t;
		return;

	}

}
