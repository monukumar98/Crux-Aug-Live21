package Lec43;

import java.util.Stack;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 4, 6, 1, 7 };
		System.out.println(Histogram_NlogN(arr, 0, arr.length - 1));

	}

	public static int Histogram_NlogN(int[] arr, int si, int ei) {
		if (si > ei) {
			return 0;
		}

		// Minimum Hight

		int min = si;
		for (int i = si + 1; i <= ei; i++) {
			if (arr[i] < arr[min]) {
				min = i;
			}

		}
		int curr_area = arr[min] * (ei - si + 1);
		int left_area = Histogram_NlogN(arr, si, min - 1);
		int right_area = Histogram_NlogN(arr, min + 1, ei);
		return Math.max(curr_area, Math.max(left_area, right_area));

	}

	public static int largestRectangleArea(int[] arr) {
		int maxarea = 0;
		Stack<Integer> s = new Stack<>();
		int i = 0;
		while (i < arr.length) {

			if (s.isEmpty() || arr[i] > arr[s.peek()]) {
				s.push(i);
				i++;

			} else {
				int hi = arr[s.pop()];

				if (s.isEmpty()) {
					int r = i;
					maxarea = Math.max(maxarea, hi * r);

				} else {
					int r = i;
					int l = s.peek();
					maxarea = Math.max(maxarea, hi * (r - l - 1));
				}

			}

		}

		while (!s.isEmpty()) {
			int hi = arr[s.pop()];

			if (s.isEmpty()) {
				int r = i;
				maxarea = Math.max(maxarea, hi * r);

			} else {
				int r = i;
				int l = s.peek();
				maxarea = Math.max(maxarea, hi * (r - l - 1));
			}

		}
		return maxarea;
				

	}

}
