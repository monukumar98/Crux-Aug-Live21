package Lec15;

public class Sipral_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] [] arr = {{1,2,3,4},
//				         {5,6,7,8},
//				         {9,10,11,12},
//				         {13,14,15,16}};
		int [][]arr= {{1,2,3,4},
				      {5,6,7,8},
				      {9,10,11,12},
				      };
		PrintSpiral(arr);

	}

	public static void PrintSpiral(int[][] arr) {
		int minr = 0;
		int minc = 0;
		int maxr = arr.length - 1;
		int maxc = arr[0].length - 1;
		int count = 0;
		int total_Elemet = arr.length * arr[0].length;
		while (count < total_Elemet) {
			// minc -- > maxc
			for (int col = minc; col <= maxc && count < total_Elemet; col++) {
				System.out.print(arr[minr][col] + " ");
				count++;

			}
			minr++;
			// minr to maxr
			for (int row = minr; row <= maxr && count < total_Elemet; row++) {
				System.out.print(arr[row][maxc] + " ");
				count++;

			}
			maxc--;

			// maxc to minc
			for (int col = maxc; col >= minc && count < total_Elemet; col--) {

				System.out.print(arr[maxr][col] + " ");
				count++;
			}
			maxr--;

			// minr to maxr

			for (int row = maxr; row >= minr && count < total_Elemet; row--) {
				System.out.print(arr[row][minc] + " ");
				count++;
			}
			minc++;

		}

	}

}
