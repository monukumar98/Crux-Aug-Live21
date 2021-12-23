package Lec53;

import java.util.ArrayList;
import java.util.List;

public class TreeRightSideView {

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

	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		rightview(root, list, 0, new Depthvalue());
		
		return list;

	}

	public void rightview(TreeNode node, List<Integer> list, int curr, Depthvalue d) {
		if (node == null) {
			return;
		}
		if (curr > d.depth) {
			list.add(node.val);
			d.depth = curr;
		}
		rightview(node.right, list, curr + 1, d);
		rightview(node.left, list, curr + 1, d);

	}

	public class Depthvalue {
		int depth = -1;
	}

}
