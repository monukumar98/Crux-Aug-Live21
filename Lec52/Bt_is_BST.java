package Lec52;

public class Bt_is_BST {
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
			if (root == null) {
				return true;
			}
			boolean ls = isValidBST(root.left);
			boolean rs = isValidBST(root.right);
			long left_max = max(root.left);
			long right_min = min(root.right);
			return ls && rs && left_max < root.val && root.val < right_min;
		}

		public long max(TreeNode root) {
			if (root == null) {
				return Long.MIN_VALUE;
			}

			if (root.right == null) {
				return root.val;
			}
			return max(root.right);

		}

		public long min(TreeNode root) {
			if (root == null) {
				return Long.MAX_VALUE;
			}

			if (root.left == null) {
				return root.val;
			}
			return min(root.left);

		}

}
}