package Lec51;

public class Balanced_Binary_Tree {
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
		public boolean isBalanced(TreeNode root) {
			if (root == null) {
				return true;
			}
			boolean lb = isBalanced(root.left);
			boolean rb = isBalanced(root.right);
			int lh = ht(root.left);
			int rh = ht(root.right);
			return lb && rb && Math.abs(lh - rh) <= 1;

		}

		public int ht(TreeNode root) {
			if (root == null) {
				return -1;
			}
			int lh = ht(root.left);
			int rh = ht(root.right);
			return Math.max(lh, rh) + 1;

		}
	}

}
