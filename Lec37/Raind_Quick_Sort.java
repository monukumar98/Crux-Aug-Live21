package Lec37;

import java.util.Random;

public class Raind_Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5};
		QuickSort(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void QuickSort(int[] arr, int si, int ei) {
		if (si >= ei) {
			return;
		}

		int pi = Pivot_index(arr, 0, ei);
		QuickSort(arr, si, pi - 1);
		QuickSort(arr, pi + 1, ei);

	}

	public static int Pivot_index(int[] arr, int si, int ei) {// 0, arr.length-1
		
		Random_number(arr, si, ei);
		int pivot = arr[ei];
		int pi = si;

		for (int i = si; i < ei; i++) {
			if (arr[i] <= pivot) {
				int t = arr[i];
				arr[i] = arr[pi];
				arr[pi] = t;

				pi++;
			}

		}
		int t = arr[ei];
		arr[ei] = arr[pi];
		arr[pi] = t;
		return pi;

	}
	
	public static void Random_number(int []arr, int si, int ei) {
		
		
		Random rand = new Random();
		int lo = si;
		int hi =ei;
		int ri = rand.nextInt(hi-lo+1)+lo;
		int temp = arr[ei];
		arr[ei]=arr[ri];
		arr[ri]=temp;
		
		
		
		
	}

}
