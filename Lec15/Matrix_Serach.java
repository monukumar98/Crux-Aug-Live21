package Lec15;

public class Matrix_Serach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3,4,41 }, 
				         { 5, 6, 7, 8 ,42}, 
				         { 9, 10, 11, 12 ,43}, 
				         { 13, 14, 15, 16 ,45} };
		System.out.println(Matrix(arr, 17));
	}

	public static boolean Matrix(int[][] arr, int item) {

		int row = 0;
		int col = arr[0].length - 1;
		while (row < arr.length && col >= 0) {
			if (arr[row][col] == item) {
				return true;
			} else if (arr[row][col] > item) {
				col--;
			} else {
				row++;
			}

		}
		return false;

	}

}
