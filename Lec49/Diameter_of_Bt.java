package Lec49;

public class Diameter_of_Bt {

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
			if (root == null) {
				return 0;
			}

			int ld = diameterOfBinaryTree(root.left);
			int rd = diameterOfBinaryTree(root.right);
			int sd = ht(root.left) + ht(root.right) + 2;
			return Math.max(ld, Math.max(rd, sd));

		}

		public int ht(TreeNode node) {
			if (node == null) {
				return -1;
			}

			int lh = ht(node.left);
			int rh = ht(node.right);
			return Math.max(lh, rh) + 1;
		}
	}

}
