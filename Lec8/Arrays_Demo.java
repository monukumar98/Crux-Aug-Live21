package Lec8;

public class Arrays_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int [5];
		System.out.println(arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr.length);
		arr[3]=10;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		int[] other =arr;
		System.out.println(other);
		System.out.println(arr);
		other[0]=100;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
		//rev
		for (int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		System.out.println("E__F__L");
		for(int val:arr) {
			System.out.print(val+" ");
			
		}
		
		

	}

}
