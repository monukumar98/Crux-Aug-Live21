package Lec25;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		cointoss(n, "");

	}

	public static void cointoss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		// head
		cointoss(n - 1, ans + "H");
		// tail
		cointoss(n - 1, ans + "T");

	}

}
