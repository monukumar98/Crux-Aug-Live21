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
	class Solution {
		public boolean isValidBST(TreeNode root) {
			return isbstfun(root).isbst;
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
		int ans=0;//bst ka sum
		int sum=0;// hole tree sum
				

	}
	}
}