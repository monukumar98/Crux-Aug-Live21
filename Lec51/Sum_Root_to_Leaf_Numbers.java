package Lec51;

import Lec51.Balanced_Binary_Tree.TreeNode;

public class Sum_Root_to_Leaf_Numbers {
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
		public int sumNumbers(TreeNode root) {

			return totalsum(root, 0);

		}

		private int totalsum(TreeNode root, int curr) {
			// TODO Auto-generated method stub
			if(root==null) {
				return 0;
			}
			if(root.left==null && root.right==null) {
				return curr*10+root.val;
			}
			
			
			int lf = totalsum(root.left, curr * 10 + root.val);
			int rf = totalsum(root.right, curr * 10 + root.val);
			return lf + rf;
			
		}

	}
}
