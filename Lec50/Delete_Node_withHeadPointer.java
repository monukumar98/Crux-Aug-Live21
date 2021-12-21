package Lec50;

import Lec50.Merge_Sort_Linkedlist.ListNode;

public class Delete_Node_withHeadPointer {

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
		public void deleteNode(ListNode node) {
			node.val = node.next.val;
			node.next = node.next.next;

		}
	}
}
