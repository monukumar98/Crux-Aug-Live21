package Lec48;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {
	Scanner sc = new Scanner(System.in);

	public class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		this.root = Create_Node(null, false);

	}

	private Node Create_Node(Node parent, boolean ilc) {// is left child
		if (parent == null) {
			System.out.println("Enter root Node data");
		}

		else if (ilc) {
			System.out.println("Enter data for left chid of " + parent.data);
		} else {
			System.out.println("Enter data for right chid of " + parent.data);
		}
		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		System.out.println("has left Child ? " + nn.data);
		boolean lc = sc.nextBoolean();
		if (lc) {
			nn.left = Create_Node(nn, true);
		}
		System.out.println("has right Child ? " + nn.data);
		boolean rc = sc.nextBoolean();
		if (rc) {
			nn.right = Create_Node(nn, false);
		}
		return nn;

	}

	public void display() {
		display(this.root);

	}

	private void display(Node nn) {
		// TODO Auto-generated method stub
		if (nn == null) {
			return;
		}
		String str = "" + nn.data;
		if (nn.left != null) {
			str = nn.left.data + "<--" + str;
		} else {
			str = ".<--" + str;
		}
		str += "-->";
		if (nn.right != null) {
			str += nn.right.data;
		} else {
			str += ".";
		}
		System.out.println(str);
		display(nn.left);
		display(nn.right);

	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		// TODO Auto-generated method stub
		if (node == null) {
			return false;
		}

		if (node.data == item) {
			return true;
		}
		boolean lans = find(node.left, item);
		boolean rans = find(node.right, item);
		return lans || rans;

	}

	public int min() {
		return min(this.root);
	}

	private int min(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return Integer.MAX_VALUE;

		}

		int lmin = min(node.left);
		int rmin = min(node.right);
		return Math.min(lmin, Math.min(rmin, node.data));

	}

	public int size() {
		return size(this.root);
	}

	private int size(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return 0;
		}

		int ls = size(node.left);
		int rs = size(node.right);
		return ls + rs + 1;

	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return -1;
		}

		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;

	}

	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();

	}

	private void PreOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		PreOrder(node.left);
		PreOrder(node.right);

	}

	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();

	}

	private void PostOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.data + " ");

	}

	public void IntOrder() {
		InOrder(this.root);
		System.out.println();

	}

	private void InOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		InOrder(node.left);
		System.out.print(node.data + " ");
		InOrder(node.right);

	}

	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(this.root);

		while (!queue.isEmpty()) {
			Node rn = queue.remove();
			System.out.print(rn.data + " ");
			if (rn.left != null) {
				queue.add(rn.left);
			}
			if (rn.right != null) {
				queue.add(rn.right);
			}

		}

	}

	public void levelOrderLinewise() {
		LinkedList<Node> queue = new LinkedList<>();
		LinkedList<Node> helper = new LinkedList<>();
		queue.add(this.root);

		while (!queue.isEmpty()) {
			Node rn = queue.remove();
			System.out.print(rn.data + " ");

			if (rn.left != null) {
				helper.add(rn.left);
			}
			if (rn.right != null) {
				helper.add(rn.right);

			}
			if (queue.isEmpty()) {
				System.out.println();
				queue = helper;
				helper = new LinkedList<>();

			}
		}

	}

}
