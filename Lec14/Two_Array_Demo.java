package Lec14;

public class Two_Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int [] [] arr=null;
		// int [] arr = null;
		//System.out.println(arr);
	    int[][] arr = new int[3][4];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		int [] []  a= new int [3][];
		System.out.println(a[0]);
		//System.out.println(a[0][1]);
		int []brr = new int [9];
		a[0]=brr;
		System.out.println(a[0]);
		System.out.println(a[0][1]);
		
		arr[2][2]=90;
		
		for (int i = 0; i <arr.length ; i++) {
			
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
			
		}

	}

}
