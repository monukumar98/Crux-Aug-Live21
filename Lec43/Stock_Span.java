package Lec43;

import java.util.Stack;

public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 30, 35, 40, 38, 35 };
		StockSpan(arr);

	}

	public static void StockSpan(int[] arr) {
		Stack<Integer> s = new Stack<>();
		int[] ans = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			// Curr Ele Span Cal
			while (!s.empty() && arr[i] > arr[s.peek()]) {

				s.pop();
			}

			if (s.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - s.peek();
			}

			// push ye kis Aur ka Span banega
			s.push(i);

		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

}
