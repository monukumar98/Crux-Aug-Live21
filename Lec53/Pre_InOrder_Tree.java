package Lec53;


public class Pre_InOrder_Tree {

	public class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;

	public Pre_InOrder_Tree(int pre[], int[] in) {
		// TODO Auto-generated constructor stub
		this.root = CreateTree(pre, 0, pre.length - 1, in, 0, in.length - 1);

	}

	private Node CreateTree(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
		// TODO Auto-generated method stub
		if(ilo>ihi || plo>phi){
            return  null;
        }

		Node nn = new Node();
		nn.data = pre[plo];
		int i = sreach(in, pre[plo]);
		int net = i - ilo;// 4-0;
		nn.left = CreateTree(pre, plo + 1, plo + net, in, ilo, i - 1);
		nn.right = CreateTree(pre, plo + net + 1, phi, in, i + 1, ihi);

		return nn;
	}

	public int sreach(int[] in, int item) {

		for (int i = 0; i < in.length; i++) {
			if (in[i] == item) {

				return i;
			}

		}
		return -1;
	}

}
