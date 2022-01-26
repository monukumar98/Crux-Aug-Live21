package Lec70;

import java.util.Arrays;

public class Counting_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 1, 1, 0, 1, 2, 5, 4, 0, 2, 8, 7, 9, 2, 6, 1, 9 };
		arr = CountingSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static int[] CountingSort(int[] arr) {

		int max = Arrays.stream(arr).max().getAsInt();
		int[] freq = new int[max + 1];

		for (int i = 0; i < arr.length; i++) {
			// freq[arr[i]] = freq[arr[i]] + 1;
			freq[arr[i]]++;

		}

		for (int i = 1; i < freq.length; i++) {
			freq[i] = freq[i - 1] + freq[i];
		}
		int[] output = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {

			int idx = freq[arr[i]];// 17
			freq[arr[i]]--;// 16
			output[freq[arr[i]]] = arr[i];// output[16]=9

		}

		return output;

	}

}
