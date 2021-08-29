package Lec9;

public class Print_SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		SubArray(arr);

	}

	public static void SubArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				for (int k = i; k <= j; k++) {//print i to j
					
					System.out.print(arr[k] + " ");

				}
				
				System.out.println();

			}

		}

	}

}
