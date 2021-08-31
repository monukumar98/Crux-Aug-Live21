package Lec10;

public class Insertion_Sort {
	public static void main(String[] args) {

		int[] arr = { 3, 4, 5, 7, 2, 1, 2 };
		Sort(arr);

	}

	public static void Sort(int[] arr) {

		for (int pass = 1; pass < arr.length; pass++) {
			
			int j=pass-1;
			int item=arr[pass];
			while(j>=0 && arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
			}
			j++;
			arr[j]=item;
			

		}

	}

}
