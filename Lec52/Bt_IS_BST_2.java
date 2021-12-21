package Lec52;

import Lec52.Bt_is_BST.TreeNode;

public class Bt_IS_BST_2 {
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
		public boolean isValidBST(TreeNode root) {
			return isbstfun(root).isbst;
		}
	}

	public BSTPair isbstfun(TreeNode root) {
		if (root == null) {
			return new BSTPair();

		}

		BSTPair lbstp = isbstfun(root.left);
		BSTPair rbstp = isbstfun(root.right);
		BSTPair sbstp = new BSTPair();
		long left_max = lbstp.max;
		long right_min = rbstp.min;
		if (lbstp.isbst && rbstp.isbst && left_max < root.val && root.val < right_min) {
			sbstp.isbst = true;
			sbstp.min = Math.min(lbstp.min, root.val);
			sbstp.max = Math.max(rbstp.max, root.val);
			return sbstp;
		}
		sbstp.isbst = false;
		sbstp.min = Math.min(lbstp.min, root.val);
		sbstp.max = Math.max(rbstp.max, root.val);
		return sbstp;

	}

	public class BSTPair {
		boolean isbst = true;
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;

	}
}
