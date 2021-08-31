package Lec10;

public class Rotate_Array {
	public static void main(String[] args) {
		
		
		int [] arr = {1,3,4,6,7,2,5};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(">>>>>>>>>>>>>");
		rotate(arr, 3);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void rotate(int[] arr, int k) {
		
		k%=arr.length;
		for(int r=1; r<=k; r++) {
         int item=arr[arr.length-1];
		for (int i = arr.length - 2; i>=0; i--) {
			arr[i+1]=arr[i];

		}
		arr[0]=item;
		}

	}
}
