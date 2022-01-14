package Lec64;

import java.util.HashMap;

public class Trie {

	public class Node {
		char data;
		boolean terminal;
		HashMap<Character, Node> children = new HashMap<>();
		int count = 0;

		public Node(char ch) {
			// TODO Auto-generated constructor stub
			this.data = ch;
			this.terminal = false;
			
		}

	}

	private Node root;

	public Trie() {
		this.root = new Node('*');

	}

	public void insert(String word) {
		Node curr = this.root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.children.containsKey(ch)) {
				curr = curr.children.get(ch);

			} else {
				Node nn = new Node(ch);
				curr.children.put(ch, nn);
				curr = nn;
			}
			curr.count++;

		}
		curr.terminal = true;

	}

	public boolean search(String word) {
		Node curr = this.root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!curr.children.containsKey(ch)) {

				return false;
			} else {
				curr = curr.children.get(ch);
			}

		}

		return curr.terminal;

	}

	public boolean startsWith(String word) {

		Node curr = this.root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!curr.children.containsKey(ch)) {

				return false;
			} else {
				curr = curr.children.get(ch);
			}

		}
		return true;

	}
	
	public int noofword(String word) {
		
		Node curr = this.root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!curr.children.containsKey(ch)) {

				return 0;
			} else {
				curr = curr.children.get(ch);
			}

		}
		return curr.count;
		
	}

}
