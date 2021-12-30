package Lec57;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Merge_k_Sorted_Lists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

	}

	class Solution {
		public ListNode mergeKLists(ListNode[] lists) {
			if (lists.length == 0) {
				return null;
			}

			System.out.println(lists.length);
			PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {

				@Override
				public int compare(ListNode o1, ListNode o2) {
					// TODO Auto-generated method stub
					return o1.val - o2.val;
				}
			});

			for (int i = 0; i < lists.length; i++) {
				if (lists[i] != null) {
					pq.add(lists[i]);
				}

			}

			ListNode ans = new ListNode(-10000);
			ListNode temp = ans;
			while (!pq.isEmpty()) {
				ListNode rn = pq.remove();
				ans.next = rn;
				ans = ans.next;
				if (rn.next != null) {
					pq.add(rn.next);
				}

			}
			return temp.next;
		}
	}
}
