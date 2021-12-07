package Lec43;

import java.util.Stack;

public class Next_Greter_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11, 13, 21, 3 };
		NGE(arr);

	}

	public static void NGE(int[] arr) {

		int[] ans = new int[arr.length];
		Stack<Integer> s = new Stack<>();

		for (int i = 0; i < ans.length; i++) {

			// curr ele kis kis NGE
			while (!s.isEmpty() && arr[i] > arr[s.peek()]) {// arr[1]>arr[0]
				ans[s.pop()] = arr[i];

			}

			// push
			s.push(i);

		}
		
		
		while(!s.isEmpty()) {
			ans[s.pop()]=-1;
		}
		
		
		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i]+"--> "+ans[i]);
		}
		

	}

}
