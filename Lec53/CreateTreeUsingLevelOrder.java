package Lec53;

import java.util.LinkedList;
import java.util.Scanner;

public class CreateTreeUsingLevelOrder {
	Scanner sc = new Scanner(System.in);

	public class Node {
		int data;
		Node left;
		Node right;

	}

	Node root;

	public CreateTreeUsingLevelOrder() {
		// TODO Auto-generated constructor stub
		this.root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		this.root = nn;
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(nn);

		while (!queue.isEmpty()) {
			Node rn = queue.remove();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				Node leftnode = new Node();
				leftnode.data = c1;
				rn.left = leftnode;
				queue.add(leftnode);

			}
			if (c2 != -1) {
				Node rightnode = new Node();
				rightnode.data = c2;
				rn.right = rightnode;
				queue.add(rightnode);
			}

		}
		return root;

	}

	public void dispaly() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node root2) {
		// TODO Auto-generated method stub
		if (root2 == null) {
			return;
		}

		System.out.print(root2.data + " ");
		PreOrder(root2.left);
		PreOrder(root2.right);

	}
	public static void main(String[] args) {
		CreateTreeUsingLevelOrder ll = new CreateTreeUsingLevelOrder();
		ll.dispaly();
	}

}
