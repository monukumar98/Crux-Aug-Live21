package Lec59;

public class SubSequnce_BitMAsking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		printsubsequnce(str);
		

	}

	public static void printsubsequnce(String str) {

		int n = str.length();
		for (int i = 0; i < (1 << n); i++) {
			printpattern(str, i);

		}

	}

	private static void printpattern(String str, int i) {
		// TODO Auto-generated method stub
		int pos = 0;
		while (i > 0) {
			if ((i & 1) != 0) {
				System.out.print(str.charAt(pos));
			}
			i >>= 1;
			pos++;
		}
		System.out.println();

	}

}
