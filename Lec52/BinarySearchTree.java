package Lec52;

public class BinarySearchTree {
	public class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;

	public BinarySearchTree(int[] arr) {
		// TODO Auto-generated constructor stub
		this.root = CrateTree(arr, 0, arr.length - 1);

	}

	private Node CrateTree(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if (si > ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		Node nn = new Node();
		nn.data = arr[mid];
		nn.left = CrateTree(arr, si, mid - 1);
		nn.right = CrateTree(arr, mid + 1, ei);
		return nn;

	}

	public void preOrder() {
		preOrder(this.root);
		System.out.println();
	}

	private void preOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		System.out.print(node.data+" ");
		preOrder(node.left);
		preOrder(node.right);

	}

}
