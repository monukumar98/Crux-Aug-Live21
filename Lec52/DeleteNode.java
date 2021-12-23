package Lec52;

public class DeleteNode {
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
		public TreeNode deleteNode(TreeNode root, int key) {
			return Delete(root, key);

		}

		public TreeNode Delete(TreeNode node, int key) {

			if (node == null) {
				return null;
			}

			if (key < node.val) {
				node.left = Delete(node.left, key);
			} else if (key > node.val) {
				node.right = Delete(node.right, key);
			} else {

				// 1 or 0 child
				if (node.left == null) {
					return node.right;
				} else if (node.right == null) {
					return node.left;
				}
				// two Child
				else {
					int left_max = min(node.right);
					node.val = left_max;
					node.right = Delete(node.right, left_max);

				}

			}
			return node;

		}

		public int min(TreeNode root) {
			if (root == null) {
				return Integer.MAX_VALUE;
			}

			if (root.left == null) {
				return root.val;
			}
			return min(root.left);

		}
	}

}
