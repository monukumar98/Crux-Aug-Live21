package Lec25;

public class Coint_No_2_Head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cointoss(3, "", false);

	}

	public static void cointoss(int n, String ans, boolean ishead) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		// head
		if (ishead == false) {
			cointoss(n - 1, ans + "H", true);
		}
		// tail
		cointoss(n - 1, ans + "T", false);

	}

}
