package Lec51;

import Lec51.Balanced_Binary_Tree.TreeNode;

public class Path_Sum_III {

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
		public int pathSum(TreeNode root, int targetSum) {
			if (root == null) {
				return 0;
			}

			int count = SelfNodePath(root,targetSum);//0
			int left_path = pathSum(root.left, targetSum);
			int right_path = pathSum(root.right, targetSum);
			return count + left_path + right_path;

		}

		private int SelfNodePath(TreeNode root,int targetSum) {
			// TODO Auto-generated method stub
			if(root==null) {
				return 0;
			}
			
			int count =0;
			if(targetSum-root.val==0) {
				count+=1;
			}
			count+=SelfNodePath(root.left, targetSum-root.val);
			count+=SelfNodePath(root.right, targetSum-root.val);
			return count;
			

		}

	}
}
