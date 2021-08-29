package Lec9;

public class Swap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] other = { 10, 20, 30, 40, 50 };
		System.out.println(arr[0] + " " + other[0]);// 1 and 10
		swap(arr, other);
		System.out.println(arr[0] + " " + other[0]);// 1 and 10  

	}

	public static void swap(int[] arr, int[] other) {

		int[] t = arr;
		arr = other;
		other = t;
		System.out.println(arr[0] + " swap " + other[0]);// 10 and 1  

	}

}
