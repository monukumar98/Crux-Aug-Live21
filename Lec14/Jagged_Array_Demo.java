package Lec14;

public class Jagged_Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][];
		arr[0] = new int[3];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;

		arr[1] = new int[2];
		arr[1][0] = 56;
		arr[1][1] = 34;
		arr[2]=new int [1];
		arr[2][0]=37;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}

}
