package Lec56;

import java.util.ArrayList;

public class Hashmap<K, V> {
	public class Node {
		K key;
		V value;
		Node next;

		public Node(K key, V value) {
			// TODO Auto-generated constructor stub
			this.key = key;
			this.value = value;

		}

	}

	private ArrayList<Node> bucketarray;
	private int size = 0;

	public Hashmap(int no_of_bucket) {
		// TODO Auto-generated constructor stub
		this.bucketarray = new ArrayList<>();// []
		for (int i = 0; i < no_of_bucket; i++) {
			this.bucketarray.add(null);
		}
	}

	public Hashmap() {
		// TODO Auto-generated constructor stub
		this(4);
	}

	// put
	public void put(K key, V value) {

		int bn = hashfunction(key);
		Node temp = this.bucketarray.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		Node nn = new Node(key, value);
		Node head = this.bucketarray.get(bn);
		nn.next = head;
		this.bucketarray.set(bn, nn);
		this.size++;
		double lf=(this.size/this.bucketarray.size());
		int thf=2;
		if(lf>thf) {
			rehashing();
		}

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> oba=this.bucketarray;
		ArrayList<Node> nba=new ArrayList<>(20);//[]
		for (int i = 0; i < 2*oba.size(); i++) {
			nba.add(null);
		}
		this.bucketarray=nba;
		this.size=0;
		
		for(Node temp : oba) {
			while(temp!=null) {
				put(temp.key, temp.value);
				temp=temp.next;
			}
		}
		
		
	}

	public V get(K key) {
		int bn = hashfunction(key);
		Node temp = this.bucketarray.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {
				return temp.value;
			}
			temp = temp.next;
		}
		return null;

	}

	public boolean ContainsKey(K key) {

		int bn = hashfunction(key);
		Node temp = this.bucketarray.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;

	}

	public V remove(K key) {
		int bn = hashfunction(key);
		Node temp = this.bucketarray.get(bn);
		Node Prev = null;
		while (temp != null) {
			if (temp.key.equals(key)) {
				break;
			}
			Prev = temp;
			temp = temp.next;
		}
		if (temp == null) {
			return null;
		}
		if (Prev == null) {// 1st node
			Prev = temp.next;
			this.bucketarray.set(bn, Prev);
		} else {
			Prev.next = temp.next;
		}
		this.size--;
		return temp.value;

	}

	public int hashfunction(K key) {

		int hc = key.hashCode();
		int bn = (hc % this.bucketarray.size());
		if (bn < 0) {
			bn += this.bucketarray.size();
		}
		return bn;

	}
	public String toString() {
		String str = "{";
		for(Node temp:this.bucketarray) {
			while(temp!=null) {
				str=str+temp.key+","+temp.value+", ";
				temp=temp.next;
			}
			
		}
		return str+"}";
		
		
		
		
	}
	public int size() {
		return this.size;
	}

}
