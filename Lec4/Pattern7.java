package Lec4;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nsp1 = 0;
		int nsp2 = n - 2;
		int row = 1;
		while (row <= n) {
			// Self Work

			// 1st space
			int csp1 = 1;
			while (csp1 <= nsp1) {
				System.out.print("  ");
				csp1++;
			}
			// 1st Star
			System.out.print("* ");
			// 2nd space
			int csp2 = 1;
			while (csp2 <= nsp2) {
				System.out.print("  ");
				csp2++;
			}
			// 2nd Star
			if (row != (n + 1) / 2) {
				System.out.print("* ");
			}

			if (row <= n / 2) {
				nsp2 -= 2;
				nsp1++;
			} else {
				nsp2 += 2;
				nsp1--;
			}
			row++;
			System.out.println();
		}

	}

}
