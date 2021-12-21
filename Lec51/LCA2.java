package Lec51;


public class LCA2 {
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
		public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

			if (isExist(root, p) == false || isExist(root, q) == false) {
				return null;
			}
			return lca(root, p, q);

		}

		public TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
			if (root == null) {
				return null;
			}
			if (root == p || root == q) {
				return root;
			}

			TreeNode left = lca(root.left, p, q);
			TreeNode right = lca(root.right, p, q);
			if (left != null && right != null) {
				return root;
			} else if (left != null) {
				return left;
			} else {
				return right;
			}

		}

		public boolean isExist(TreeNode root, TreeNode p) {
			if (root == null) {
				return false;
			}

			if (root == p) {
				return true;
			}

			boolean lp = isExist(root.left, p);
			boolean rp = isExist(root.right, p);
			return lp || rp;

		}

	}
}
