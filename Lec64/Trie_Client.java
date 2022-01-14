package Lec64;


public class Trie_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie t = new Trie();
		t.insert("Ram");
		t.insert("Ravan");
		t.insert("Rajesh");
		t.insert("Apple");
		System.out.println(t.search("Apple"));
		System.out.println(t.noofword("A"));
		

	}

}
