package Lec51;


public class Balanced_Binary_Tree_Opt {
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
			return Balanced(root).isbalance;

		}

		public BalancedPair Balanced(TreeNode root) {
			if (root == null) {
				return new BalancedPair();
			}

			BalancedPair lbp = Balanced(root.left);
			BalancedPair rbp = Balanced(root.right);
			BalancedPair sbp = new BalancedPair();
			sbp.ht = Math.max(lbp.ht, rbp.ht) + 1;
			boolean selfbalance = Math.abs(lbp.ht - rbp.ht) <= 1;
			sbp.isbalance = lbp.isbalance && rbp.isbalance && selfbalance;
			return sbp;

		}

	}

	public class BalancedPair {
		boolean isbalance = true;
		int ht = -1;

	}

}
