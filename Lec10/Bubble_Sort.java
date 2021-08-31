package Lec10;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 5, 7, 2, 1, 2 };
		Sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();

	}

	public static void Sort(int[] arr) {
		for (int pass = 1; pass < arr.length; pass++) {// pass<=arr.lenght-1
			for (int j = 0; j < arr.length - pass; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

}
