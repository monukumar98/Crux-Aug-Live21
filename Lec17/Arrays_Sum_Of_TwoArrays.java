package Lec17;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays_Sum_Of_TwoArrays {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();

		}
		ArrayList<Integer> ans =Sum_Of_TwoArrays(arr1, arr2);
		for (int i = 0; i <ans.size(); i++) {
			System.out.print(ans.get(i)+", ");
			
		}
		System.out.println("END");
		

	}
	public static ArrayList<Integer> Sum_Of_TwoArrays(int [] arr1, int []arr2) {
		ArrayList<Integer> ans = new ArrayList<>();
		
		int i=arr1.length-1;
		int j =arr2.length-1;
		int carry=0;
		while(i>=0 || j>=0 ) {
			int sum=0;
			if(i>=0) {
				sum+=arr1[i];
				i--;
			}
			if(j>=0) {
				sum+=arr2[j];
				j--;
			}
			sum+=carry;
			ans.add(0, sum%10);
			carry=sum/10;
			
		}
		if(carry>0) {
			ans.add(0, carry);
		}
		return ans;
		
		
	}
}
