package Lec44;

public class LinkedList {

	public class Node {
		int data;
		Node next;

		public Node(int item) {
			// TODO Auto-generated constructor stub
			this.data = item;
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}

	}

	private Node head;
	private Node tail;
	private int size;// no of Node kitne Add hue hai
	// O(1)

	public void addFirst(int item) {
		Node nn = new Node(item);

		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;

		} else {
			nn.next = this.head;// 1k
			this.head = nn;
			this.size++;

		}

	}

	public void addLast(int item) {

		if (this.size == 0) {
			this.addFirst(item);
		} else {
			Node nn = new Node(item);
			this.tail.next = nn;
			this.tail = nn;
			this.size++;

		}

	}

	public void AddatIndex(int k, int item) throws Exception {

		if (k == 0) {
			this.addFirst(item);
		} else if (k == this.size) {
			this.addLast(item);
		} else {
			Node nn = new Node(item);
			Node before = GetNode(k - 1);
			nn.next = before.next;
			before.next = nn;
			this.size++;

		}

	}

	private Node GetNode(int k) throws Exception {

		if (k < 0 || k >= this.size) {
			throw new Exception("Index Out of Bound");

		}

		Node temp = this.head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;

	}

	public int GetFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("Linkedlist khaali hai pgl data kyu Access kr rahe ho ");
		}

		return this.head.data;

	}

	public int GetLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linkedlist khaali hai pgl data kyu Access kr rahe ho ");
		}
		return this.tail.data;

	}

	public int GetatAnyIndex(int k) throws Exception {
		if (this.size == 0) {
			throw new Exception("Linkedlist khaali hai pgl data kyu Access kr rahe ho ");
		}

		return this.GetNode(k).data;

	}

	public int RemoveFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Pgl hai kya ");
		}

		int rv = this.head.data;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size--;
		} else {
			Node temp = this.head;
			this.head = this.head.next;
			temp.next = null;
			this.size--;
		}
		return rv;

	}

	public int RemoveLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("Pgl hai kya ");
		}

		else if (this.size == 1) {
			return this.RemoveFirst();
		}

		else {
			Node sl = GetNode(this.size - 2);
			int rv = sl.next.data;
			sl.next = null;
			this.tail = sl;
			this.size--;
			return rv;

		}

	}

	public int RemoveatAnyIndex(int k) throws Exception {

		if (k < 0 || k >= this.size) {
			throw new Exception("Index Out of Bound");

		}
		if (k == 0) {
			return this.RemoveFirst();
		} else if (k == this.size - 1) {
			return this.RemoveLast();
		} else {
			Node k_1 = GetNode(k - 1);// 2k
			Node kth = GetNode(k);// 3k
			k_1.next = kth.next;
			kth.next = null;
			this.size--;
			return kth.data;

		}

	}

	public void Display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;

		}
		System.out.println(".");
	}

//Lec45	

	public void dataReverseI() throws Exception {

		int left = 0;
		int right = this.size - 1;
		while (left < right) {
			Node left_node = GetNode(left);
			Node Right_node = GetNode(right);
			int t = left_node.data;
			left_node.data = Right_node.data;
			Right_node.data = t;

			left++;
			right--;

		}

	}

	public void PointerReverseI() {

		Node prev = null;
		Node curr = this.head;
		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;

	}

	public void PointerReverseRecursive() {
		PointerReverseRecursive(this.head, null);
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;

	}

	private void PointerReverseRecursive(Node curr, Node prev) {
		if (curr == null) {
			return;
		}

		PointerReverseRecursive(curr.next, curr);
		curr.next = prev;

	}

	public void DataReverseRecursive() {
		HeapMover mover = new HeapMover();
		mover.left = this.head;
		DataReverseRecursive(head, mover, 0);

	}

	public class HeapMover {
		Node left;
	}

	private void DataReverseRecursive(Node curr, HeapMover mover, int count) {
		if (curr == null) {
			return;
		}
		DataReverseRecursive(curr.next, mover, count + 1);
		if (count >= this.size / 2) {
			int t = mover.left.data;
			mover.left.data = curr.data;
			curr.data = t;
			mover.left = mover.left.next;

		}
	}

	public int mid() {
		Node slow = this.head;
		Node fast = this.head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow.data;

	}

}
