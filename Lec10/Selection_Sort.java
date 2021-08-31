package Lec10;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 5, 7, 2, 1, 2 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

	public static void Sort(int[] arr) {
		for (int couter = 0; couter < arr.length; couter++) {// 0 to n-1
			int min = couter;

			for (int i = couter + 1; i < arr.length; i++) {
				if (arr[i] < arr[min]) {
					min = i;
				}

			}

			int temp = arr[couter];
			arr[couter] = arr[min];
			arr[min] = temp;

		}

	}

}
