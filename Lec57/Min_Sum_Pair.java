package Lec57;

import java.util.PriorityQueue;

public class Min_Sum_Pair {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();// min heap
		// PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder())
		// max Heap
		int[] arr = { 2, 2, 3, 3, 4 };

		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);

		}
		int sum = 0;
		while (pq.size() > 1) {

			int a = pq.remove();
			int b = pq.remove();
			sum += (a + b);
			pq.add(a + b);
		}
		System.out.println(sum);

	}

}
