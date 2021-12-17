package Lec49;

import Lec49.Diameter_of_Bt.TreeNode;

public class Diameter_bt_Optimise {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root).d;

		}

		public class DiaPair {
			int d = 0;// null 0
			int h = -1;// null -1;

		}

		public DiaPair diameter(TreeNode root) {
			if (root == null) {
				return new DiaPair();
			}
			DiaPair ldp = diameter(root.left);
			DiaPair rdp = diameter(root.right);

			DiaPair sdp = new DiaPair();
			sdp.h = Math.max(ldp.h, rdp.h) + 1;////hight
			int sd = ldp.h + rdp.h + 2;//self Diameter 
			sdp.d = Math.max(ldp.d, Math.max(rdp.d, sd));// Math.max(ld, Math.max(rd, sd));
			return sdp;
		}

	}
}
