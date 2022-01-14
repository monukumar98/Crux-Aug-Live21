package Lec64;

import java.util.*;


public class VerticalOrderTraversalofaBinaryTree {

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

	public class VerticalPair {
		TreeNode node;
		int vt = 0;
		int ht = 0;
	}

	public List<List<Integer>> VerticalOrder(TreeNode root) {

		LinkedList<VerticalPair> queue = new LinkedList<>();
		VerticalPair vp = new VerticalPair();
		TreeMap<Integer, ArrayList<VerticalPair>> map = new TreeMap<>();
		vp.node = root;
		queue.add(vp);

		while (!queue.isEmpty()) {
			VerticalPair rvp = queue.remove();
			if (!map.containsKey(rvp.vt)) {
				map.put(rvp.vt, new ArrayList<>());

			}
			map.get(rvp.vt).add(rvp);

			if (rvp.node.left != null) {

				VerticalPair nvp = new VerticalPair();
				nvp.node = rvp.node.left;
				nvp.vt = rvp.vt - 1;
				nvp.ht = rvp.ht + 1;
				queue.add(nvp);
			}
			if (rvp.node.right != null) {
				VerticalPair nvp = new VerticalPair();
				nvp.node = rvp.node.right;
				nvp.vt = rvp.vt + 1;
				nvp.ht = rvp.ht + 1;
				queue.add(nvp);
			}

		}

		// output formate
		List<List<Integer>> list = new ArrayList<>();
		for (int key : map.keySet()) {
			List<VerticalPair> ll = map.get(key);
			Collections.sort(ll, new Comparator<VerticalPair>() {

				@Override
				public int compare(VerticalPair o1, VerticalPair o2) {
					// TODO Auto-generated method stub
					if (o1.ht == o2.ht) {
						return o1.node.val - o2.node.val;
					}
					return 0;

				}

			});
			
			List<Integer> l= new ArrayList<>();
			for (int i = 0; i <ll.size(); i++) {
				l.add(ll.get(i).node.val);
				
			}
			list.add(l);

		}
		return list;

	}

}
