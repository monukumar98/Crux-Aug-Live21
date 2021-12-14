package Lec48;

public class Client_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		bt.display();
//10 true 20 true 30 false true 50 false false true 60 false false true 70 true 90 false false true 110 false false
//		System.out.println(bt.find(85));
//		System.out.println(bt.min());
//		System.out.println(bt.size());
//		System.out.println(bt.ht());
		bt.PreOrder();
		bt.PostOrder();
		bt.IntOrder();

	}

}
