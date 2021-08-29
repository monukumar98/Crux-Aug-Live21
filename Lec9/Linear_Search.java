package Lec9;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 3, 67, 8, 9 };
		int item = 3;
		System.out.println(linearSearch(arr, item));

	}
	public static int linearSearch(int []arr,int item) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==item) {
				return i;
			}
			
		}
		return -1;
		
		
	}

}
