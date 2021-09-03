package Lec11;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		int k = 3;
		k=k%n;// 7-->1 8--->2  

		reverse(arr, n - k, n - 1);// last k element
		reverse(arr, 0, n - k - 1);// fast n-k element
		reverse(arr, 0, arr.length - 1);// hole

	}

	public static void reverse(int[] arr, int si, int end) {
		int i = si;
		int j = end;
		while (i < j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			j--;
			i++;
		}

	}

}
