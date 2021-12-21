package Lec50;

public class Merge_Sort_Linkedlist {
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
		public ListNode sortList(ListNode head) {
			if (head == null || head.next == null) {
				return head;
			}
			ListNode mid = mid(head);// 3
			ListNode midnext = mid.next;// 4
			mid.next = null;
			ListNode left = sortList(head);
			ListNode right = sortList(midnext);
			return mergeTwoLists(left, right);

		}
		 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		     ListNode temp = new ListNode(-1);
						ListNode prev = temp;
						while (l1 != null && l2 != null) {
							if (l1.val <= l2.val) {
								temp.next = l1;
								l1 = l1.next;
							} else {
								temp.next = l2;
								l2 = l2.next;
							}
							temp = temp.next;
						}
						if (l1 == null) {
							temp.next = l2;
						}
						if (l2 == null) {
							temp.next = l1;
						}
						
						return  prev.next;

		        
		    }

		public ListNode mid(ListNode head) {
			ListNode slow = head;
			ListNode fast = head;
			while (fast.next != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow;
		}

	}
}
