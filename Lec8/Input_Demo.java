package Lec8;

import java.util.Scanner;

public class Input_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// size of array
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		display(arr);
		int [] b = New_array(5);
		display(b);

	}
	public static int []  New_array(int n) {
		
		int []a = new int [n];
		return a;
		
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
